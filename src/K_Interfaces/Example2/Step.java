package K_Interfaces.Example2;

public class Step implements Bestuurbaar {

    @Override // methode besturen wordt overschreven door class Step
    public void besturen() {
        System.out.println("Aan de kant, ik kom eraan");
    }
}