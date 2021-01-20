package StaticStatement.StaticStatement;

public class Main {

    // step 1: create new class StaticTest.java

    public static void main(String[] args) {
        // step 5: create instances
        StaticTest firstInstance = new StaticTest("1st Instance");
        System.out.println(firstInstance.getName() + " is instance number " + firstInstance.getNumInstances());
        StaticTest secondInstance = new StaticTest("2nd instance");
        System.out.println(secondInstance.getName() + " is instance number " + secondInstance.getNumInstances());

        // if you run these two you'll get:
        // 1st Instance is instance number 1
        // 2nd instance is instance number 1

        // we started with numbers is equal zero but a static field which is also known as a class variable is associated
        // with the class rather than with any particular instance of it, so it's only ever one copy of the variable in
        // memory. All instances of the class share that one class variable
    }
}
