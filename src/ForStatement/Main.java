package ForStatement;

public class Main {

    public static void main(String[] args) {
        // loops can execute a block of code as long as a certain condition is met
        // loops are useful because they save time, reduce errors and make the code easier to read
        // when you know exactly how many times you want to loop through a block of code, use the for loop instead of a while loop
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0)); // 10,000 at 2% interest = 200.0
        System.out.println("10,000 at 3% interest = " + calculateInterest(10000.0, 3.0)); // 10,000 at 3% interest = 300.0
        System.out.println("10,000 at 4% interest = " + calculateInterest(10000.0, 4.0)); // 10,000 at 4% interest = 400.0
        System.out.println("10,000 at 5% interest = " + calculateInterest(10000.0, 5.0)); // 10,000 at 5% interest = 500.0

        // in the example above you have to make too much code, we do the same but with a loop
        // for(init; termination; increment)
        // init means the code that is going to be initialized once at the start of the loop
        // termination is we tell the for loop how we want to exit, at what point do we exit
        // increment that's an expression that's invoke after each iteration of the loops each time the loop goes round
        for(int i=0; i<5; i++) {
            System.out.println("Loop " + i + " hello!");
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}