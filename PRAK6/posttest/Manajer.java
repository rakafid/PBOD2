public class Manajer extends Pegawai {
    private int tunjangan = 700_000;

    public Manajer(String nama) {
        setNama(nama);
    }

    @Override
    public void tampilData() {
        // memanggil behavior dasar dari Pegawai
        super.tampilData();
        System.out.println("Tunjangan : " + tunjangan);
    }
}
