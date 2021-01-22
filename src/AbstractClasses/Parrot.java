package AbstractClasses;

// step 14: Parrot extends from Bird
public class Parrot extends Bird {

    // step 15: constructor
    public Parrot(String name) {
        super(name);
    }

    // step 16: override method fly
    // parrots automatically eat and breath from Bird, so we don't have to re-implement those methods again
    // add System.out.println
    @Override
    public void fly() {
        System.out.println("Flitting from branch to branch");
    }
}