package H_ClassAndObjects;

public class Car {
    // step 1: creating a field for a class
    // general rule, when you're defining fields in Java in a class, you go with the access modifier private
    // these variables are the state component for a Car
    // trying to create is a template of the variables that would be part and parcel of a Car
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    // step 2: create an object from this class, the class is just the template, which will sort of take that blueprint,
    // that definition that we've defined in the class and create an object that we can start using.
    // we will do this in the Main class

    // step 3: making methods so that the fields or state variables are accessible for the main class: setters and getters
    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}
