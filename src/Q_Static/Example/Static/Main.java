package Q_Static.Example.Static;

public class Main {
    // step 01: public int multiplier = 7;
    // step 04: change 'public int' into 'public static int'
    public static int multiplier = 7;

    public static void main(String[] args) {
        // step 03: call the method
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

    // step 02: method multiply
    // step 05: change 'public int' into 'public static int'
    public static int multiply(int number) {
        return number * multiplier;
    }
}
