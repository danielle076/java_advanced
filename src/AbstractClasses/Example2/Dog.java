package AbstractClasses.Example2;

// step 6: Dog extends from Animal
public class Dog extends Animal {

    // step 7: constructor
    public Dog(String name) {
        super(name);
    }

    // step 8: override methods
    // add System.out.println
    @Override
    public void eat() {
        System.out.println(getName() + " is eating");
    }

    @Override
    public void breathe() {
        System.out.println("Breathe in, breathe out, repeat");

    }
}

// the important thing here is that not all methods have to be abstract. This is one of the differences between an
// abstract class and an interface, you can actually mix these up

