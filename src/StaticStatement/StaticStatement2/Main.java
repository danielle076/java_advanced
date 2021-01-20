package StaticStatement.StaticStatement2;

public class Main {

    public static void main(String[] args) {
        StaticTest firstInstance = new StaticTest("1st Instance");
        System.out.println(firstInstance.getName() + " is instance number " + firstInstance.getNumInstances());
        StaticTest secondInstance = new StaticTest("2nd instance");
        System.out.println(secondInstance.getName() + " is instance number " + secondInstance.getNumInstances());

        // step 7: if you run these two you'll get:
        // 1st Instance is instance number 1
        // 2nd instance is instance number 2

        // step 8: create third one
        StaticTest thirdInstance = new StaticTest("3rd instance");
        System.out.println(thirdInstance.getName() + " is instance number " + secondInstance.getNumInstances());

        // step 9: thirdInstance has 'secondInstance' and it works
        // run these three you'll get:
        // 1st Instance is instance number 1
        // 2nd instance is instance number 2
        // 3rd instance is instance number 3
        // the reason it returned it is because they're all sharing the same copy of instances, so it doesn't
        // matter. Which instance of the class we use to access a static field, it's always going to return that what
        // is then the valid number
    }
}
