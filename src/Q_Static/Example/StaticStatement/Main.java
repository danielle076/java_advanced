package Q_Static.Example.StaticStatement;

public class Main {

    // step 1: create new class StaticTest.java

    public static void main(String[] args) {
        // step 5: create instances
        StaticTest firstInstance = new StaticTest("1st Instance");
        System.out.println(firstInstance.getName() + " is instance number " + firstInstance.getNumInstances());
        StaticTest secondInstance = new StaticTest("2nd instance");
        System.out.println(secondInstance.getName() + " is instance number " + secondInstance.getNumInstances());
    }
}
