/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas;

/**
 *
 * @author Legion
 */
public abstract class Anabul {
    protected String nama;

    public Anabul (String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public abstract String suara();
    public abstract String gerak();
}