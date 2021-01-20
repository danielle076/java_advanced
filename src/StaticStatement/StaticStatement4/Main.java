package StaticStatement.StaticStatement4;

public class Main {

    // now that we understand static methods and fields, and these are sometimes referred to as class methods and
    // class variables, we can work out why all the methods we've created in main have also been static

    // step 12: field in this class
    // step 15: change 'public int' into 'public static int'
    public static int multiplier = 7;

    public static void main(String[] args) {
        // step 14: call the method
        // gives an error: 'Non-static method multiply int can't be referenced from a static context.'
        // so if multiply is public, then why can't we access it from our main method?
        // normal class fields require an instance of the class that don't actually exist until an instance has been
        // created. The main method is static as we can see. And it can be called with the class instance. As a result,
        // Java can't allow a static method to access non-static fields or methods because frankly they don't exist when
        // the static Methods called
        int answer = multiply(6);
        System.out.println("The answer is " + answer);
        System.out.println("Multiplier is " + multiplier);
    }

    // step 13: method multiply
    // the public method multiply takes a number and returns the result of multiplying it with the public multiplier
    // field that we defined on line 10.
    // step 16: change 'public int' into 'public static int'
    public static int multiply(int number) {
        return number * multiplier;
    }
}
