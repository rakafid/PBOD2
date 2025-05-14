/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author Legion
 */
public class Kucing extends Anabul{
    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public String suara() {
        return "meong";
    }

    @Override
    public String gerak() {
        return "melata";
    }
}