package L_AbstractClasses.Example3;

// step 18: Penguin extends from Bird
public class Penguin extends Bird {

    // step 19: constructor
    public Penguin(String name) {
        super(name);
    }

    // step 20: override method fly
    @Override
    public void fly() {
        System.out.println("I'm not very good at that, can I go for a swim instead?");
    }
}
