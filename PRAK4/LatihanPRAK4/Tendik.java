/*
 * File       : Tendik.java
 * Deskripsi  : Kelas untuk tenaga kependidikan (Tendik).
 * Pembuat    : Muhammad Rakan Hafidh Al Ghalib
 * Tanggal    : 16-03-2025
 */

import java.time.LocalDate;

public class Tendik extends Pegawai {
    private String unitKerja;

    public Tendik(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String unitKerja) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.unitKerja = unitKerja;
    }

    public String getUnitKerja() {
        return unitKerja;
    }

    public void setUnitKerja(String unitKerja) {
        this.unitKerja = unitKerja;
    }

    @Override
    public void printInfo() {
        System.out.println("NIP           : " + nip);
        System.out.println("Nama          : " + nama);
        System.out.println("Unit Kerja    : " + unitKerja);
        LocalDate today = LocalDate.of(2025, 3, 10);
        int[] masaKerja = hitungMasaKerja(today);
        System.out.println("Tanggal Lahir : " + formatTanggal(tanggalLahir));
        System.out.println("TMT           : " + formatTanggal(tmt));
        System.out.println("Masa Kerja    : " + masaKerja[0] + " tahun " + masaKerja[1] + " bulan");
        System.out.println("Gaji Pokok    : Rp " + String.format("%,.2f", gajiPokok));
        double tunjangan = 0.01 * masaKerja[0] * gajiPokok;
        System.out.println("Tunjangan     : 1% x " + masaKerja[0] + " x Rp " + String.format("%,.2f", gajiPokok) + " = Rp " + String.format("%,.2f", tunjangan));
        System.out.println();
    }
}
