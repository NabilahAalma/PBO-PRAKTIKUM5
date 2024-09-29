package Potongan_Harga;

import java.util.Scanner;

public class Demo_Pembelian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Total pembelian Rp. = ");//Mengambil input dari pengguna.
        double totalPembelian = input.nextDouble();

        Pembelian pembelian = new Pembelian(totalPembelian);//Membuat objek Pembelian dengan data yang diinputkan.

        System.out.println("\n===== Tampilan Pembayaran =====");//Menampilkan hasil perhitungan potongan dan jumlah yang harus dibayarkan.
        System.out.println("Total pembelian Rp. = " + pembelian.getTotalPembelian());
        System.out.println("Besarnya potongan Rp. = " + pembelian.hitungPotongan());
        System.out.println("Jumlah yang harus dibayarkan Rp. = " + pembelian.hitungJumlahBayar());
        System.out.print("==============================\n");
    }
}
/*run(pertama):
Total pembelian Rp. = 50000

===== Tampilan Pembayaran =====
Total pembelian Rp. = 50000.0
Besarnya potongan Rp. = 10000.0
Jumlah yang harus dibayarkan Rp. = 40000.0
==============================
BUILD SUCCESSFUL (total time: 8 seconds)

run(kedua):
Total pembelian Rp. = 60000

===== Tampilan Pembayaran =====
Total pembelian Rp. = 60000.0
Besarnya potongan Rp. = 12000.0
Jumlah yang harus dibayarkan Rp. = 48000.0
==============================
BUILD SUCCESSFUL (total time: 7 seconds)
*/