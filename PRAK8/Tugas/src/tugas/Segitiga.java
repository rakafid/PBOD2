/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author Legion
 */
public class Segitiga extends BangunDatar {
    private double alas;
    private double tinggi;
    private double sisi;

    public Segitiga(double alas, double tinggi) {
        super("Segitiga");
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi = Math.hypot(alas / 2,  tinggi);
    }

    @Override
    public double luas() {
        return (alas * tinggi) / 2;
    }

    @Override
    public double keliling() {
        return 2 * sisi + alas;
    }
}
