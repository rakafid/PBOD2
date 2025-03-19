package PRAK4;

public class lingkaran extends bangunDatar {
    private double jariJari;

    public lingkaran() {
        setJmlSisi(0);
    }

    public lingkaran(double diameter, String warna, String border){
        this.jariJari = diameter / 2;
        setWarna(warna);
        setBorder(border);
        setJmlSisi(0);
    }

    public double getJari(){
        return jariJari;
    }

    public void setJari(double jariJari){
        this.jariJari = jariJari;
    }

    public double getLuas() {
        return Math.PI * jariJari * jariJari;
    }

    public double getKeliling() {
        return 2 * Math.PI * jariJari;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("jariJari: " + jariJari);
        System.out.println("Luas: " + getLuas());
        System.out.println("Keliling: " + getKeliling());
    }
}
