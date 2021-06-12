package L_AbstractClasses.Example3;

// step 10: abstract class Bird extends from abstract class Animal
public abstract class Bird extends Animal {
    // step 11: constructor
    public Bird(String name) {
        super(name);
    }

    // step 12: override methods
    // add System.out.println
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

// it's implementing the required methods that the Animal class requires it to, namely eat and breathe. But it's also
// defining an abstract method fly

// you can't directly instantiate a class that is abstract in anyway (can't put in the main class). So what we need to
// do is create another class: parrot.java