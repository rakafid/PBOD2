/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author Legion
 */
public class MBangunDatarGenerik {
    public static void main(String[] args) {
        BangunDatarGenerik<BangunDatar> bdg = new BangunDatarGenerik<>();
        bdg.add(new Persegi(6));
        bdg.add(new PersegiPanjang(2,7));
        bdg.add(new Segitiga(4,3));
        bdg.showAll();
    }
}