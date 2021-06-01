package H_ClassAndObjects;

public class Main {

    public static void main(String[] args) {
        // example Car.java - step 2: creating an object
        // 'Car' is a class but we can treat it as a data type
        // 'porsche' is the name of the object
        // when creating a new Class you need to initialize it by '= new Car();'
        Car porsche = new Car();

        // example Car.java - step 4: calling the set model method for our object and updating it with the value Carrera
        porsche.setModel("Carrera");
        System.out.println("Model is " + porsche.getModel());

        // example Loop.java - loopCharacters with void
        Loop loop1 = new Loop();
        loop1.loopCharacters();

        // example Loop.java - returnData with return
        loop1.printData("Dit is een tweede test");
    }
}
