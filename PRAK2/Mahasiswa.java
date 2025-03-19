package PRAK2;

import java.util.ArrayList;

public class Mahasiswa {
    private String nim;
    private String nama;
    private String prodi;
    private ArrayList<matakuliah> listMatKul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    //konstruktor
    public Mahasiswa() {
        this.listMatKul = new ArrayList<>();
    }
    
    public Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatKul = new ArrayList<>();
    }
    
    //setgetter
    public String getnim(){
        return nim;
    }

    public void setnim(String nim){
        this.nim = nim;
    }
    
    public String getnama(){
        return nama;
    }

    public void setnama(String nama){
        this.nama = nama;
    }
    
    public String getprodi(){
        return prodi;
    }

    public void setprodi(String prodi){
        this.prodi = prodi;
    }
    
    public Dosen getdosenWali(){
        return dosenWali;
    }

    public void setdosen(Dosen dosenWali){
        this.dosenWali = dosenWali;
    }

    public ArrayList<matakuliah> getmatkul(){
        return listMatKul;
    }
    
    public void setmatkul(ArrayList<matakuliah> listMatkul){
        this.listMatKul = listMatKul;
    }

    public Kendaraan getKendaraan(){
        return kendaraan;
    }

    public void setkendaraan(Kendaraan kendaraan){
        this.kendaraan = kendaraan;
    }


    //Method
    public void addMatkul(matakuliah newMK){
        listMatKul.add(newMK);
    }

    public int getjumlahSKS(){
        int SKS = 0;
        for(matakuliah i : listMatKul){
            SKS += i.getsks();
        }
        return SKS;
    }

    public int getMatkul(){
        return listMatKul.size();
    }

    public void printMhs(){
        System.out.println("Nim     : " + nim);
        System.out.println("Nama    : " + nama);
        System.out.println("Prodi   : " + prodi);
    }

    public void printDetMhs(){
        printMhs();
        System.out.println("Kendaraan : " + (kendaraan == null ? "Tidak Ada" : kendaraan.getjenis() + " \nPlat : " + kendaraan.getnoPlat()));
        System.out.println("Dosen Wali : " + dosenWali.getnama());
        System.out.println("Daftar Mata Kuliah : ");
        int i;
        for (i = 0; i < listMatKul.size(); i++){
            System.out.println(listMatKul.get(i).getnama());
        }
    }
    
}
