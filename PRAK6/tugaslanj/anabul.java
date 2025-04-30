public abstract class anabul {
    private String nama;

    public anabul (String nama){
        this.nama = nama;
    }

    //getter 
    public String getNama(){
        return nama;
    }
    
    //setter 
    public void setNama(String nama){
        this.nama = nama;
    }

    //method 
    public abstract void gerak();
    public abstract void bersuara();
}