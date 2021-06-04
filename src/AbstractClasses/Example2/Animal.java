package AbstractClasses.Example2;

// step 1: making the class abstract 'public abstract class'
public abstract class Animal {
    // step 2: variable
    private String name;

    // step 3: constructor
    public Animal(String name) {
        this.name = name;
    }

    // step 4: method, use abstract. We haven't implemented these methods at all
    public abstract void eat();

    public abstract void breathe();

    // step 5: getter
    public String getName() {
        return name;
    }
}

// we're gonna inherit from this abstract class. It's going to let us define behaviors that are necessary, without
// specifying how they are to be performed

// with interface you saw that the entire interface was abstract, and there's no implementation whatsoever.
// there's no opportunity for us to enter fields. There wasn't any opportunity for us to enter any other code. We purely
// were able just to specify the methods that were gonna be used for that interface, that a class that was implementing
// that particular interface had to actually fulfil in order to make it valid. But as you can see in the case of Animal,
// we can mix it up. We can add fields, we can add regular methods, or a constructor