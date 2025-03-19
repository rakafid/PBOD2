package PRAK4;

public class main {
    public static void main(String[] args) {
        persegi persegi1 = new persegi(5, "Merah", "Hitam");
        lingkaran lingkaran1 = new lingkaran(7, "Biru", "Putih");

        System.out.println("Informasi persegi:");
        persegi1.printInfo();
        System.out.println();

        System.out.println("Informasi lingkaran:");
        lingkaran1.printInfo();
    }
}
