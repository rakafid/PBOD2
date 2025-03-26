/**  
* File         : Main.java   
* Deskripsi    : Main class untuk menjalankan dan menguji implementasi
*                dari semua class
* Pembuat      : Muhammad Rakan Hafidh
* NIM          : 24060123130087
* Tanggal      : 22 Maret 2025  
*/

public class Main {
    public static void main(String[] args) {
        PNS p1 = new PNS("Satriyo", "01-04-2006", "Jl. Seroja", 15000000, "198302032006041002");
        Pengusaha pe1 = new Pengusaha("Adhy", "01-01-2000", "Jl.Air", 55000000, "000-556-773-212-000-5");
        Petani pt1 = new Petani("Nugraha", "09-01-1977", "Jl. Bunga 9 Tembalang", 5000000, "wonogiri");
        PNS p2 = new PNS("Panji", "01-04-2010", 10000000, "198004212010041002");
        p2.setAlamat("Jl. Panorama 111 Tembalang");

        System.out.println("========== DATA PEGAWAI ==========\n");
        System.out.println("Jumlah Manusia     : " + Manusia.getCounterMns());
        System.out.println("Jumlah PNS         : " + PNS.getCounterPNS());
        System.out.println("Jumlah Pengusaha   : " + Pengusaha.getCounterPengusaha());
        System.out.println("Jumlah Petani      : " + Petani.getCounterPetani());
        System.out.println("\n========== PERHITUNGAN PAJAK ==========");
        System.out.printf("Pajak PNS p1        : Rp%,.0f%n", p1.hitungPajak());
        System.out.printf("Pajak Pengusaha pe1 : Rp%,.0f%n", pe1.hitungPajak());
        System.out.printf("Pajak Petani pt1    : Rp%,.0f%n", pt1.hitungPajak());

        System.out.println("\n========== MASA KERJA ==========");
        System.out.println("Masa Kerja p1       : " + p1.hitungMasaKerja() + " tahun");
        System.out.println("Masa Kerja pe1      : " + pe1.hitungMasaKerja() + " tahun");
        System.out.println("Masa Kerja pt1      : " + pt1.hitungMasaKerja() + " tahun");

        System.out.println("\n========== DETAIL INFO PEGAWAI ==========");
        System.out.println("\n>>> Data PNS p1");
        p1.cetakInfo();
        System.out.println("\n>>> Data Pengusaha pe1");
        pe1.cetakInfo();
        System.out.println("\n>>> Data Petani pt1");
        pt1.cetakInfo();
        System.out.println("\n>>> Data PNS p2");
        p2.cetakInfo();

        System.out.println("\n==========================================");
    }
}