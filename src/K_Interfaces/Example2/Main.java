package K_Interfaces.Example2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Bestuurbaar> voertuigen = new ArrayList(); // er wordt een ArrayList mey de naam voertuigen aangemaakt, deze ArrayList is van het type Bestuurbaar. We hebben dus een lijst aangemaakt op basis van de type van de interface en dan kun je classes die de interface implementeren toevoegen aan de verzameling

        Auto auto = new Auto(); // Object aangemaakt van class Auto
        Step step = new Step(); // Object aangemaakt van class Step

        voertuigen.add(auto); // hier wordt auto class toegevoegd aan voertuigen ArrayList
        voertuigen.add(step); // hier wordt step class toegevoegd aan voertuigen ArrayList

        for (Bestuurbaar b : voertuigen) {
            b.besturen(); // deze for-loop loopt door de lijst met voertuigen en roept deze aan met de besturen methode
        }
    }
}