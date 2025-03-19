package PRAK2;

public class matakuliah {
    private String idMatkul;
    private String nama;
    private int sks;

    public matakuliah(){}
    
    public matakuliah(String idMatkul, String nama, int sks){
        this.idMatkul = idMatkul;
        this.nama = nama;
        this.sks = sks;
    }

    public String getidMatkul(){
        return idMatkul;
    }

    public void setidMatkul(String idMatkul){
        this.idMatkul = idMatkul;
    }
    
    public String getnama(){
        return nama;
    }

    public void setnama(String x){
        this.nama = x;
    }
    
    public int getsks(){
        return sks;
    }

    public void setsks(int x){
        this.sks = x;
    }


}
