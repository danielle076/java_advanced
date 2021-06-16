package R_FinalStatement;

public class Main {

    public static void main(String[] args) {
        // step 4: creating instances
        SomeClass one = new SomeClass("one");
        SomeClass two = new SomeClass("two");
        SomeClass three = new SomeClass("three");

        // step 5: notice how they're all maintaining their own value for instance number
        System.out.println(one.getInstanceNumber());
        System.out.println(two.getInstanceNumber());
        System.out.println(three.getInstanceNumber());

        // step 6: check instanceNumber
//        one.instanceNumber = 4; // error: Cannot assign a value to final variable instanceNumber

        // step 13: instance
        int pw = 674312;
        Password password = new Password(pw);
        password.storePassword();

        // step 14: method letMeIn
        password.letMeIn(6); // Nope, you cannot come in
        password.letMeIn(-5497); // Nope, you cannot come in
        password.letMeIn(721946); // Nope, you cannot come in
        password.letMeIn(674312); // Welcome

        // step 19: instance
        int pw2 = 674312;
        Password passwordex = new ExtendedPassword(pw);
        passwordex.storePassword();
    }
}
