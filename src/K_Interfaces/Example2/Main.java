package K_Interfaces.Example2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Bestuurbaar> voertuigen = new ArrayList();

        Auto auto = new Auto();
        Step step = new Step();

        voertuigen.add(auto);
        voertuigen.add(step);

        for (Bestuurbaar b : voertuigen) {
            b.besturen();
        }
    }
}