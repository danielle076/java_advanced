package Q_Static.Example.StaticStatement3;

public class Main {

    public static void main(String[] args) {
        // step 11: change 'firstInstance.getNumInstances' into 'StaticTest.getNumInstances'
        StaticTest firstInstance = new StaticTest("1st Instance");
        System.out.println(firstInstance.getName() + " is instance number " + StaticTest.getNumInstances());
        StaticTest secondInstance = new StaticTest("2nd instance");
        System.out.println(secondInstance.getName() + " is instance number " + StaticTest.getNumInstances());

        StaticTest thirdInstance = new StaticTest("3rd instance");
        System.out.println(thirdInstance.getName() + " is instance number " + StaticTest.getNumInstances());

        // it makes it clear now, because you're saying that it's the class name, and it's not using the instance
        // name, firstInstance. This is a static method

        // static methods and fields belong to the class, not to instances of the class, and as a result, can be called
        // by referencing the class name, as you see here, rather than a class instance. This explains why the main
        // method we've used throughout the course has to be static
    }
}
