/*
 * File       : Pegawai.java
 * Deskripsi  : Kelas abstrak untuk pegawai.
 * Pembuat    : Muhammad Rakan Hafidh Al Ghalib
 * Tanggal    : 16-03-2025
 */

import java.time.LocalDate;

public abstract class Pegawai {
    protected String nip;
    protected String nama;
    protected LocalDate tanggalLahir;
    protected LocalDate tmt;
    protected double gajiPokok;

    public Pegawai(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok) {
        this.nip = nip;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.tmt = tmt;
        this.gajiPokok = gajiPokok;
    }

    protected int[] hitungMasaKerja(LocalDate now) {
        int tahun = now.getYear() - tmt.getYear();
        int bulan = now.getMonthValue() - tmt.getMonthValue();
        if (bulan < 0) {
            bulan += 12;
            tahun -= 1;
        }
        return new int[]{tahun, bulan};
    }

    protected String formatTanggal(LocalDate tgl) {
        int day = tgl.getDayOfMonth();
        int month = tgl.getMonthValue();
        int year = tgl.getYear();
        String[] namaBulan = {"Januari", "Februari", "Maret", "April", "Mei", "Juni",
                "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
        return day + " " + namaBulan[month - 1] + " " + year;
    }

    public abstract void printInfo();

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public LocalDate getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(LocalDate tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public LocalDate getTmt() {
        return tmt;
    }

    public void setTmt(LocalDate tmt) {
        this.tmt = tmt;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }
}
