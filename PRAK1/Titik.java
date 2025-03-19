package PRAK1;

public class Titik {
    private double absis;
    private double ordinat;
    private static int countertitik = 0;


    public Titik() {
        this.absis = 0;
        this.ordinat = 0;
        countertitik++;
    }

    public Titik(double x, double y){
        this.absis = x;
        this.ordinat = y;
        countertitik++;
    }

    public static int getcountertitik(){
        return countertitik;
    }

    public double getabsis(){
        return absis;
    }

    public double getordinat(){
        return ordinat;
    }


    public void setabsis(double x){
        absis = x;
    }

    public void setordinat(double x){
        ordinat = x;
    }

    public void geser (double x, double y){
        absis = x + absis;
        ordinat = x + ordinat;
    }

    public void printtitik() {
        System.out.println("Titik (" + absis + ", " + ordinat + ")");
    }

    public int getkuadran(){
        if (absis > 0 && ordinat > 0) return 1;
        if (absis < 0 && ordinat > 0) return 2;
        if (absis < 0 && ordinat < 0) return 3;
        if (absis > 0 && ordinat < 0) return 4;
        else return 0;
    }

    public double getjarakpusat(){
        return Math.sqrt(Math.pow(Math.abs(absis), 2) + Math.pow(Math.abs(ordinat), 2));
    } 

    public double getjaraK(Titik T) {
        return Math.sqrt(Math.pow(Math.abs(T.getabsis() - this.absis), 2) + Math.pow(Math.abs(T.getordinat() - this.ordinat), 2));
    }

    public void refleksiX(){
        absis = absis * -1;
    }

    public void refleksiY(){
        ordinat = ordinat * -1;
    }

    public Titik getrefleksiX(){
        return new Titik(-absis, ordinat);
    }
    public Titik getrefleksiY(){
        return new Titik(absis, -ordinat);
    }

}

class MTitik {
    public static void main(String[] args)  {
        Titik T1 = new Titik();
        T1.setabsis(3);
        T1.setordinat(4);
        T1.printtitik();
        T1.geser(3, 4);
        T1.printtitik();
        System.out.println("Jarak T1 Ke Pusat = " + T1.getjarakpusat());
        System.out.println("kuadran T1 = " + T1.getkuadran());

        Titik T2 = new Titik();
        T2.printtitik();
        T2.setabsis(10);
        T2.setordinat(10);
        T2.printtitik();
        
        System.out.println("Jarak T2 Ke Pusat = " + T2.getjarakpusat());
        System.out.println("kuadran T2 = " + T2.getkuadran());
        System.out.println("Jarak antara titik T1 dan T2 = " + T1.getjaraK(T2));
        System.out.println("Jumlah Titik = " + T1.getcountertitik());

        //refleksi
        System.out.println("Refleksi dari T1 :");
        T1.refleksiX();
        T1.printtitik();
        T1.refleksiY();
        T1.printtitik();
        
        //getrefleksi
        System.out.println("getRefleksi dari T1 :");
        Titik refleksiX = T1.getrefleksiX();
        Titik refleksiY = T1.getrefleksiY();
        refleksiX.printtitik();
        refleksiY.printtitik();
    }   
}