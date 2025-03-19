package PRAK2;

public class MMahasiswa {
    public static void main(String[] args) {
        Dosen dosen1 = new Dosen("12345", "Pak Budi", "Informatika");
        Kendaraan kendaraan1 = new Kendaraan("AB 1234 CD", Kendaraan.Jenis.Mobil);
        
        Mahasiswa mhs1 = new Mahasiswa("220001", "Adi", "Informatika");
        mhs1.setdosen(dosen1);
        mhs1.setkendaraan(kendaraan1);

        matakuliah mk1 = new matakuliah("IF101", "Algoritma Pemrograman", 3);
        matakuliah mk2 = new matakuliah("IF102", "Struktur Data", 3);
        mhs1.addMatkul(mk1);
        mhs1.addMatkul(mk2);

        System.out.println("=== Data Mahasiswa ===");
        mhs1.printDetMhs();
        System.out.println("Total Mata Kuliah: " + mhs1.getMatkul());
        System.out.println("Total SKS: " + mhs1.getjumlahSKS());
    }
}
