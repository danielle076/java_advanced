package L_AbstractClasses.Example3;

// step 10: abstract class Bird extends from abstract class Animal
public abstract class Bird extends Animal {
    // step 11: constructor
    public Bird(String name) {
        super(name);
    }

    // step 12: override methods
    @Override
    public void eat() {
        System.out.println(getName() + " is pecking");
    }

    @Override
    public void breathe() {
        System.out.println("Breathe in, breathe out, repeat");
    }

    // step 13: add abstract method fly
    public abstract void fly();
}