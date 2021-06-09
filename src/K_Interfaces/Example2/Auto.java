package K_Interfaces.Example2;

public class Auto implements Bestuurbaar {

    @Override // methode besturen wordt overschreven door class Auto
    public void besturen() {
        System.out.println("Vroem Vroem, toet toet");
    }
}
