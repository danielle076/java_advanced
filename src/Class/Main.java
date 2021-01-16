package Class;

public class Main {

    public static void main(String[] args) {
	    // an object has a state and a behavior
        // an object stores its state in fields, the variables
        // they expose their behavior with methods

        // class is a template or blueprint for creating objects
        // when creating classes it is recommended to start the name with a Captital

        // creating an object
        // 'Car' is a class but we can treat it as a data type
        // 'porsche' is the name of the object
        // when creating a new Class you need to initialize it by '= new Car();'
        Car porsche = new Car();

        // how to access the state variables or the fields? They are private, make them public with getters and setters
        // calling the set model method for our object and updating it with the value Carrera
        porsche.setModel("Carrera");
        System.out.println("Model is " + porsche.getModel());
    }
}
