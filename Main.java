package com.company;

import java.util.Scanner;

/**
 * Yogie Alfin Salim
 * 10117100
 * IF - 3
 * Deskripsi : program ini berisi program untuk menampilkan nilai
 * terbesar dan terkecil yang di input oleh user dengan
 * konsep OOP
 */
public class Main {

    public static void main(String[] args) {
        String namaPetugas;
        int jmlMahasiswa;

        Nilai hasil = new Nilai();
        Scanner scn = new Scanner(System.in);

        System.out.println("===Program nilai terbesar dan nilai terkceil===");
        System.out.print("Masukkan Nama Petugas\t\t\t: ");
        namaPetugas = scn.nextLine();
        System.out.print("Masukkan Banyaknya Mahasiswa\t:  ");
        jmlMahasiswa = scn.nextInt();
        System.out.println();

        hasil.inputNilai(jmlMahasiswa);
        System.out.println();
        hasil.tampilNilaiTerbesarTerkecil(jmlMahasiswa);

        System.out.println("Nilai Terbesar\t: " + hasil.nilaiBesar);
        System.out.println("Nilai Terkecil\t: " + hasil.nilaiKecil);
        System.out.println();
        System.out.println("Nama Petugas\t\t: " + namaPetugas);
    }

}
