package Array;

public class Main {
    public static void main(String[] args) {
        String[] bakkerstraat = new String[4];

        bakkerstraat[0] = "Familie Janssen";
        bakkerstraat[1] = "Bakker Bart";
        bakkerstraat[2] = "Familie de Blauw";
        bakkerstraat[3] = "Koos van den Berg";

        System.out.println("Bewoner is: " + bakkerstraat[1]);

        for (int index = 0; index < bakkerstraat.length; index++) {
            System.out.println(bakkerstraat[index]);
        }
    }
}
