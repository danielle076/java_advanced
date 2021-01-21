package FinalStatement;

// final statement: you use that generally to define constant values
// but also if you want to prevent that a class can be extended, that a method can be overridden or that the value of a
// variable is overwritten, you use the keyword final. So you can use final on class, method and variable level. It's
// very useful to selectively make some methods final in your classes if you know they're gonna be overwritten or
// there's a chance they're gonna be overwritten

public class Main {

    public static void main(String[] args) {
        // step 4: creating instances
        // unlike with static where we had a getter for the static field and we always got the same value, here
        // we're storing the incremented static value in a class field
        // so each instance of a class will maintain its own value
        SomeClass one = new SomeClass("one");
        SomeClass two = new SomeClass("two");
        SomeClass three = new SomeClass("three");
        // prints out:
        // one created, instance is 1
        // two created, instance is 2
        // three created, instance is 3

        // step 5: notice how they're all maintaining their own value for instance number
        System.out.println(one.getInstanceNumber());
        System.out.println(two.getInstanceNumber());
        System.out.println(three.getInstanceNumber());
        // prints out:
        // 1
        // 2
        // 3

        // step 6: by making instance number final, its value can't be changed once the class instance has been created
        // attempting to do so will give an error, and the code won't even compile
//        one.instanceNumber = 4; // error: Cannot assign a value to final variable instanceNumber
        // it's actually a good idea to mark variables as final whenever you know that the value shouldn't be changed
        // once the initial value's been set. A constant value would be an ideal candidate for that (didn't use it in this example)

        // step 13: create a new password instance, called storePassword
        int pw = 674312;
        Password password = new Password(pw);
        password.storePassword();
        // prints out:
        // Saving password as 747902050
        // this is a complete different number then 674312
        // the constructor takes the password and encrypts it

        // step 14: call the letMeIn method, with a few passwords to check to see if it is working
        password.letMeIn(6); // Nope, you cannot come in
        password.letMeIn(-5497); // Nope, you cannot come in
        password.letMeIn(721946); // Nope, you cannot come in
        password.letMeIn(674312); // Welcome

        // step 19: create a new extended password instance, called storePassword
        int pw2 = 674312;
        Password passwordex = new ExtendedPassword(pw);
        passwordex.storePassword();
        // prints out:
        // Saving password as 674312
        // you can see how this is completely changed the security of the original password class

        // step 20 in Password.java: change 'storePassword' into final: it cannot override store password because method is final
    }
}
