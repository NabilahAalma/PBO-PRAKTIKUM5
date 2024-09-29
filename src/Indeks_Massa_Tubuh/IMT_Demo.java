package Indeks_Massa_Tubuh;

import java.util.Scanner;

public class IMT_Demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("===== Data Nilai Indeks Massa Tubuh =====");
        System.out.print("Berat Badan (kg): ");//Mengambil input dari pengguna.
        float beratBadan = input.nextFloat();

        System.out.print("Tinggi Badan (m): ");
        float tinggiBadan = input.nextFloat();

        IMT hasilIMT = new IMT(beratBadan, tinggiBadan);//Membuat objek `IMT` dari data yang diinput.

        System.out.println("-----------------------------------------");//Menampilkan hasil perhitungan IMT dan kriteria kegemukan.
        System.out.println("Berat Badan: " + hasilIMT.getberatBadan() + " kg");
        System.out.println("Tinggi Badan: " + hasilIMT.gettinggiBadan() + " m");
        System.out.println("Nilai IMT: " + hasilIMT.hitungIMT());
        System.out.println("Kriteria: " + hasilIMT.getkriteria());
    }
}
/*run:
===== Data Nilai Indeks Massa Tubuh =====
Berat Badan (kg): 60
Tinggi Badan (m): 1,60
-----------------------------------------
Berat Badan: 60.0 kg
Tinggi Badan: 1.600000023841858 m
Nilai IMT: 23.437498092651367
Kriteria: Berat Badan Ideal
BUILD SUCCESSFUL (total time: 20 seconds*/