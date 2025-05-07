/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.senjata;

/**
 *
 * @author Legion
 */

public class KontrolSenjata {
    private Senjata senjata;

    public KontrolSenjata(Senjata s) {
        this.senjata = s;
    }

    public boolean isAdaPeluru() {
        return senjata.getPeluru() > 0;
    }

    public void isiPeluru(int jumlahPeluru) {
        senjata.setPeluru(jumlahPeluru);
        System.out.println(">> Peluru berhasil ditambah: " + jumlahPeluru);
    }

    public void menembak(int jumlah) {
        System.out.println(">> Siap menembak " + jumlah + " kali");
        for (int i = 0; i < jumlah; i++) {
            if (isAdaPeluru()) {
                System.out.println(senjata.getBunyi());
                senjata.setPeluru(-1);
            } else {
                System.out.println("Peluru Habis");
            }
        }
        System.out.println(">> Peluru sisa: " + senjata.getPeluru());
    }

    public void menusuk() {
        if (senjata.isMenusuk()) {
            System.out.println("Menusuk musuh!");
        } else {
            System.out.println("Bayonet tidak terpasang");
        }
    }

    public void pasangBayonet() {
        senjata.setMenusuk(true);
    }
}

