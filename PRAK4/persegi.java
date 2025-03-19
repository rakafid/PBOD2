package PRAK4;

public class persegi extends bangunDatar {
    private double sisi;

    public persegi() {
        setJmlSisi(4);
    }

    public persegi(double sisi, String warna, String border) {
        super(4, warna, border);
        this.sisi = sisi;
    }

    public double getSisi() {
        return this.sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double getLuas(){
        return sisi * sisi;
    }

    public double getKeliling(){
        return sisi * 4;
    }

    public double getDiagonal(){
        return sisi * Math.sqrt(2);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Sisi : " + getSisi());
        System.out.println("Luas: " + getLuas());
        System.out.println("Keliling: " + getKeliling());
    }

    public static void printCounterBangunDatar() {
        bangunDatar.printCounterBangunDatar();
    }


}