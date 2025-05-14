/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author Legion
 */
import java.util.Random;

public class KoleksiAnabul {
    private Koleksi<Anabul> koleksi;

    public KoleksiAnabul() {
        koleksi = new Koleksi<>(10);
        isiKoleksi();
    }

    private void isiKoleksi() {
        Random rand = new Random();
        String[] namaHewan = {"Gembul", "Mochi", "Piko", "Zola", "Oreo", "Max", "Luna", "Felix", "Jerry", "Tom"};

        for (int i = 0; i < 10; i++) {
            int jenis = rand.nextInt(3);
            String nama = namaHewan[i];

            switch (jenis) {
                case 0 -> koleksi.add(new Kucing(nama));
                case 1 -> koleksi.add(new Anjing(nama));
                case 2 -> koleksi.add(new Burung(nama));
            }
        }
    }

    public void showAll() {
        System.out.println("Isi KoleksiAnabul:");
        for (int i = 0; i < koleksi.getSize(); i++) {
            Anabul a = koleksi.getIsi(i);
            System.out.println("Nama : " + a.getNama());
            System.out.println("bersuara " + a.suara());
            System.out.println("bergerak dengan " + a.gerak());
            System.out.println();
        }
    }
}