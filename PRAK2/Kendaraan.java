package PRAK2;

public class Kendaraan {
    public enum Jenis {Motor, Mobil};

    private String noPlat;
    private Jenis jenis;

    public Kendaraan(){}
    
    public Kendaraan(String noPlat, Jenis jenis){
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    public String getnoPlat(){
        return noPlat;
    }

    public void setNoplat(String noPlat){
        this.noPlat = noPlat;
    }
    
    public Jenis getjenis(){
        return jenis;
    }

    public void setjenis(Jenis x){
        this.jenis = x;
    }
    
}
