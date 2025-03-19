/*
 * File       : Main.java
 * Deskripsi  : Kelas utama untuk menguji implementasi pegawai (Dosen Tetap, Dosen Tamu, dan Tendik).
 * Pembuat    : Muhammad Rakan Hafidh Al Ghalib
 * Tanggal    : 16-03-2025
 */

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        DosenTetap dt = new DosenTetap(
                "9545647548",
                "78647324",
                "Andi",
                LocalDate.of(1990, 5, 5),
                LocalDate.of(2015, 1, 1),
                5000000,
                "Fakultas Sains dan Matematika"
        );

        DosenTamu dtu = new DosenTamu(
                "9533456677",
                "11223344",
                "Budi",
                LocalDate.of(1985, 10, 12),
                LocalDate.of(2020, 3, 1),
                3000000,
                "Fakultas Teknik"
        );

        Tendik tendik = new Tendik(
                "9522233344",
                "Citra",
                LocalDate.of(1992, 8, 25),
                LocalDate.of(2017, 6, 15),
                4000000,
                "Unit Keuangan"
        );

        System.out.println("=== Informasi Dosen Tetap ===");
        dt.printInfo();
        System.out.println("\n=== Informasi Dosen Tamu ===");
        dtu.printInfo();
        System.out.println("\n=== Informasi Tendik ===");
        tendik.printInfo();
        
    }
}
