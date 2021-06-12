package Q_Static.Example.StaticStatement2;

public class Main {

    public static void main(String[] args) {
        StaticTest firstInstance = new StaticTest("1st Instance");
        System.out.println(firstInstance.getName() + " is instance number " + firstInstance.getNumInstances());
        StaticTest secondInstance = new StaticTest("2nd instance");
        System.out.println(secondInstance.getName() + " is instance number " + secondInstance.getNumInstances());

        // step 8: create third instance
        StaticTest thirdInstance = new StaticTest("3rd instance");
        System.out.println(thirdInstance.getName() + " is instance number " + secondInstance.getNumInstances());
    }
}
