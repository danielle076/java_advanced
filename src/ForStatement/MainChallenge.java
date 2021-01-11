package ForStatement;

public class MainChallenge {
    public static void main(String[] args) {
        // Challenge 1
        for (int i = 2; i < 9; i++)
            System.out.println("10,000 at " + i + "% interest = " + calculateInterest(10000.0, i));

        System.out.println("****************");

        // Challenge 2
        for (int i = 8; i >= 2; i--) {
            System.out.println("10,000 at " + i + "% interest = " + calculateInterest(10000.0, i));
        }

        System.out.println("****************");

        // Challenge 3
        int count = 0;
        for (int i = 10; i < 50; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is a prime number");
                if (count == 3) {
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }
    }

    // code given by the teacher
    public static double calculateInterest(double amount, double interest) {
        return (amount * (interest / 100));
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            System.out.println("Looping " + i);
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}


