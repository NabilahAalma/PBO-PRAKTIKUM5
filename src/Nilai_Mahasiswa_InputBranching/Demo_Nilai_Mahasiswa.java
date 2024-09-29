package Nilai_Mahasiswa_InputBranching;

import java.util.Scanner;

public class Demo_Nilai_Mahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//membuat objek input untuk menyimpan hsail input ke var yang di tuju

        System.out.print("===== Input Data Mahasiswa ===== \n");//Mengambil input dari pengguna.
        
        System.out.print("NPM: ");
        String npm = input.nextLine();

        System.out.print("Nama Mahasiswa: ");
        String nama = input.nextLine();

        System.out.print("Nilai Kehadiran: ");
        float nilaiKehadiran = input.nextFloat();

        System.out.print("Nilai Tugas: ");
        float nilaiTugas = input.nextFloat();

        System.out.print("Nilai UTS: ");
        float nilaiUTS = input.nextFloat();

        System.out.print("Nilai UAS: ");
        float nilaiUAS = input.nextFloat();

        Nilai_Mahasiswa mahasiswa = new Nilai_Mahasiswa(npm, nama, nilaiKehadiran, nilaiTugas, nilaiUTS, nilaiUAS);
        System.out.print("===== Data Mahasiswa ===== \n ");//Membuat objek mahasiswa dengan data yang diinputkan.

        System.out.println("NPM Mahasiswa: " + mahasiswa.getNpm());//Menampilkan hasil perhitungan nilai akhir, grade, dan keterangan.
        System.out.println("Nama Mahasiswa: " + mahasiswa.getNama());
        System.out.println("Nilai Akhir: " + mahasiswa.hitungNilaiAkhir());
        System.out.println("Grade: " + mahasiswa.getGrade());
        System.out.println("Keterangan: " + mahasiswa.getKeterangan());
        System.out.print("=========================== \n");
    }   
}
/*run:
===== Input Data Mahasiswa ===== 
NPM: 1234567890
Nama Mahasiswa: Abcd Efgh Ijkl
Nilai Kehadiran: 100
Nilai Tugas: 60
Nilai UTS: 90
Nilai UAS: 90
===== Data Mahasiswa ===== 
 NPM Mahasiswa: 1234567890
Nama Mahasiswa: Abcd Efgh Ijkl
Nilai Akhir: 85.0
Grade: A
Keterangan: ISTIMEWA
=========================== 
BUILD SUCCESSFUL (total time: 27 seconds)*/