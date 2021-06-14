package L_AbstractClasses.Example3;

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

