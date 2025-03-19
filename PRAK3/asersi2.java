class Lingkaran {
    private double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    public double hitungKeliling() {
        double keliling = 2 * Math.PI * jariJari;
        return keliling;
    }
}

public class asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;
        assert (jariJari > 0) : "jari jari tidak boleh nol!!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling lingkaran = " + kelilingLingkaran);
    }
}

/* Pnggunaan asersi kurang tepat karena asersi 
seharusnya digunakan untuk mendeteksi kondisi yang tidak mungkin 
terjadi dalam keadaan normal selama debugging, bukan sebagai 
mekanisme utama untuk memvalidasi input, yang seharusnya 
ditangani dengan if-else agar program tetap dapat berjalan dengan aman */