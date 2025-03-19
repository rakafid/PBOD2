/*
 * File       : DosenTetap.java
 * Deskripsi  : Kelas untuk dosen tetap.
 * Pembuat    : Muhammad Rakan Hafidh Al Ghalib
 * Tanggal    : 16-03-2025
 */

import java.time.LocalDate;

public class DosenTetap extends Dosen {
    private String nidn;

    public DosenTetap(String nip, String nidn, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String fakultas) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidn = nidn;
    }

    public String getNidn() {
        return nidn;
    }

    public void setNidn(String nidn) {
        this.nidn = nidn;
    }

    @Override
    public void printInfo() {
        System.out.println("NIP           : " + nip);
        System.out.println("NIDN          : " + nidn);
        System.out.println("Nama          : " + nama);
        super.printInfo();
        System.out.println("Jabatan       : Dosen Tetap");
        System.out.println("Fakultas      : " + fakultas);
        System.out.println("Gaji Pokok    : Rp " + String.format("%,.2f", gajiPokok));
        int tahunMasaKerja = hitungMasaKerja(LocalDate.of(2025, 3, 10))[0];
        double tunjangan = 0.02 * tahunMasaKerja * gajiPokok;
        System.out.println("Tunjangan     : 2% x " + tahunMasaKerja + " x Rp " + String.format("%,.2f", gajiPokok) + " = Rp " + String.format("%,.2f", tunjangan));
        System.out.println();
    }
}
