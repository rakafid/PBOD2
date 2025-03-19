/*
 * File       : DosenTamu.java
 * Deskripsi  : Kelas untuk dosen tamu.
 * Pembuat    : Muhammad Rakan Hafidh Al Ghalib
 * Tanggal    : 16-03-2025
 */

import java.time.LocalDate;

public class DosenTamu extends Dosen {
    private String nidk;

    public DosenTamu(String nip, String nidk, String nama, LocalDate tanggalLahir, LocalDate tmt, double gajiPokok, String fakultas) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidk = nidk;
    }

    public String getNidk() {
        return nidk;
    }

    public void setNidk(String nidk) {
        this.nidk = nidk;
    }

    @Override
    public void printInfo() {
        System.out.println("NIP           : " + nip);
        System.out.println("NIDK          : " + nidk);
        System.out.println("Nama          : " + nama);
        super.printInfo();
        System.out.println("Jabatan       : Dosen Tamu");
        System.out.println("Fakultas      : " + fakultas);
        System.out.println("Gaji Pokok    : Rp " + String.format("%,.2f", gajiPokok));
        System.out.println("Tunjangan     : Rp 0,00");
        System.out.println();
    }
}
