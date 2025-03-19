/*
 * File       : Dosen.java
 * Deskripsi  : Kelas abstrak untuk dosen yang merupakan turunan dari Pegawai.
 * Pembuat    : Muhammad Rakan Hafidh Al Ghalib
 * Tanggal    : 16-03-2025
 */

import java.time.LocalDate;

public abstract class Dosen extends Pegawai {
    protected String fakultas;

    public Dosen(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String fakultas) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.fakultas = fakultas;
    }

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    protected LocalDate getBUP() {
        LocalDate bup = tanggalLahir.plusYears(65);
        bup = LocalDate.of(bup.getYear(), bup.getMonthValue(), 1).plusMonths(1);
        return bup;
    }

    @Override
    public void printInfo() {
        LocalDate today = LocalDate.of(2025, 3, 10);
        int[] masaKerja = hitungMasaKerja(today);
        System.out.println("Tanggal Lahir : " + formatTanggal(tanggalLahir));
        System.out.println("TMT           : " + formatTanggal(tmt));
        System.out.println("Masa Kerja    : " + masaKerja[0] + " tahun " + masaKerja[1] + " bulan");
        System.out.println("BUP           : " + formatTanggal(getBUP()));
    }
}
