package PRAK2;

public class Dosen {
    private String nip;
    private String nama;
    private String prodi;


    public Dosen(){}
    
    public Dosen(String x, String y, String z){
        this.nip = x;
        this.nama = y;
        this.prodi = z;
    }

    public String getnip(){
        return nip;
    }

    public void setnip(String x){
        this.nip = x;
    }
    
    public String getnama(){
        return nama;
    }

    public void setnama(String x){
        this.nama = x;
    }
    
    public String getprodi(){
        return prodi;
    }

    public void setprodi(String x){
        this.prodi = x;
    }

}
