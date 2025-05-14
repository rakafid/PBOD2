/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author Legion
 */
import java.util.ArrayList;
import java.util.List;

public class BangunDatarGenerik <T extends BangunDatar> {
    private List<T> list = new ArrayList<>();

    public void add (T bd) {
        list.add(bd);
    }

    public void showAll() {
        for (T bd : list) {
            System.out.println("Bangun Datar : " + bd.getNama());
            System.out.println("Luas : " + bd.luas());
            System.out.println("Keliling : " + bd.keliling());
            System.out.println();
        }
    }
}