public class kucing extends anabul{
    public kucing(String nama){
        super(nama);
    }

    @Override
    public void gerak(){
        System.out.println(getNama() + " Begerak dengan cara melata");
    }

    @Override
    public void bersuara(){
        System.out.println(getNama() + " bersuara : Meong");
    }
}
