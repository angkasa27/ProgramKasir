package tugasjava;

import java.util.Scanner;

public class TugasJava {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ulang;
        String namaBarang, kodeBarang;
        System.out.println("Nama    : Dimas Angkasa Nurindra");
        System.out.println("Kelas   : X RPL 6");
        System.out.println("No. Abs : 19");
        System.out.println("");
        System.out.println("####PROGRAM_KASIR####");
        System.out.println("");
        System.out.println("Kasir Login");
        System.out.print("Username : ");
        String namaKasir = input.next();
        System.out.println("");
        System.out.println("####_MULAI_####");
        do {
            System.out.println("----------------------------");
            Toko kasir = new Toko();
            kasir.menghitung();
            System.out.println("----------------------------");
            System.out.print("Reset dari awal? (y=1/n=2)");
            ulang = input.nextInt();
        } while (ulang == 1);
        System.out.println("####Terima_Kasih####");
    }

}

class Toko {

    public void menghitung() {
        Scanner input = new Scanner(System.in);
        String namaBarang, kodeBarang;
        int hargaBarang, jumlahBarang, tambah, totalA, totalAkhir;
        int totalB = 0;
        int diskon;
        do {
            System.out.print("Kode barang   :");
            kodeBarang = input.next();
            System.out.print("Nama barang   : ");
            namaBarang = input.next(); 
            System.out.print("Harga barang  : Rp");
            hargaBarang = input.nextInt();
            System.out.print("Jumlah barang : ");
            jumlahBarang = input.nextInt();
            totalA = hargaBarang * jumlahBarang;
            totalB += totalA;
            System.out.print("Tambah Barang? (y=1/n=2) ");
            tambah = input.nextInt();
        } while (tambah == 1);

        if (totalB >= 100000) {
            diskon = totalB * 10 / 100;
            totalAkhir = totalB - diskon;
            if (totalB >= 200000) {
                diskon = totalB * 20 / 100;
                totalAkhir = totalB - diskon;
                if (totalB >= 500000) {
                    diskon = totalB * 50 / 100;
                    totalAkhir = totalB - diskon;
                }
            }
        } else {
            totalAkhir = totalB;
        }

        System.out.println("Total   : Rp" + totalAkhir);
        System.out.print("Bayar   : Rp");
        int bayar = input.nextInt();
        int kembali = bayar - totalAkhir;
        System.out.println("Kembali : Rp" + kembali);
        

    }
}
