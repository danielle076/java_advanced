package H_ClassAndObjects;

public class Car {
    // 'public class Car' means: the statement to create a new class with the name Car

    // access modifiers:
    // 1. Public: it can be accessed from within the class, outside the class, within the package and outside the package
    // 2. Private: access level of a private modifier is only within the class. It cannot be accessed from outside the class
    // 3. Protected: access level is within the package and outside the package through child class. If you do not make the child class, it cannot be accessed from outside the package
    // 4. Default: access level is only within the package. It cannot be accessed from outside the package. If you do not specify any access level, it will be the default

    // class is a template or blueprint for creating objects

    // classes allow us to create variables that can be seen and are accessible from anywhere within the class that
    // we're creating. These are called class or member variables but most commonly refer to them as fields.

    // creating a field for a class
    // general rule, when you're defining fields in Java in a class, you go with the access modifier private
    // these variables are the state component for a Car
    // trying to create here is a template of the variables that would be part and parcel of a Car
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    // create an object from this class, the class is just the template, which will sort of take that blueprint,
    // that definition that we've defined in the class and create an object that we can start using.
    // we will do this in the Main class

    // making methods so that the fields or state variables are accessible for the main class: setters and getters
    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}
