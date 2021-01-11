**For challenges**

***Challenge 1***

Using the for statement, call the calculateInterest method with the amount of 10000 with an interestRate of 2,3,4,5,6,7, and 8. <br/>
Print the results to the console window.

***Challenge 2***

How would you modify the for loop above to do the same thing as shown but to start from 8% and work back to 2%.

***Challenge 3***

Create a for statement using any range of numbers.<br/>
Determine if the number is a prime number using the isPrime method if it is a prime number, print it out.<br/>
AND increment a count of the number of prime numbers found if that count is 3 exit the for loop.<br/>

Hint: Use the break statement to exit

Code given by the teacher:

    public static double calculateInterest(double amount, double interest) {
        return (amount * (interest / 100));
    }

and

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