package AbstractClasses;

// step 18: Penguin extends from Bird
public class Penguin extends Bird {

    // step 19: constructor
    public Penguin(String name) {
        super(name);
    }

    // step 20: override method fly
    // penguins automatically eat and breath from Bird, so we don't have to re-implement those methods again
    // add System.out.println
    @Override
    public void fly() {
        System.out.println("I'm not very good at that, can I go for a swim instead?");
    }
}
