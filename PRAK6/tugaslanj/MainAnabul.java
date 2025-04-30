public class MainAnabul {
    public static void main(String[] args) {
        anabul kucing = new kucing("cukurukuk");
        anabul anjing = new anjing("shiba");
        anabul burung = new burung("Digiding");

        kucing.gerak();
        kucing.bersuara();
        System.out.println("\n");
        anjing.gerak();
        anjing.bersuara();
        System.out.println("\n");
        burung.gerak();
        burung.bersuara();
    }
}