package L_AbstractClasses.Example3;

// step 14: Parrot extends from Bird
public class Parrot extends Bird {

    // step 15: constructor
    public Parrot(String name) {
        super(name);
    }

    // step 16: override method fly
    @Override
    public void fly() {
        System.out.println("Flitting from branch to branch");
    }
}