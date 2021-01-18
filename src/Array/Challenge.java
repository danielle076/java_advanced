package Array;

import java.util.Scanner;

public class Challenge {
    // step 1: (System.in) allows you to type input into the console that gets returned back to the program
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // step 2: we're going to create a method and that method is going to automatically allow us to type in five
        // numbers. It will return those five numbers in the form of an array. Those contents will be stored in myIntegers arrays
        int[] myIntegers = getIntegers(5);

        // step 5: create for loop and print for method getIntegers
        for (int i = 0; i < myIntegers.length; i++) {
            System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
        }
        // step 7: create print for method getAverage
        System.out.println("The average is " + getAverage(myIntegers));
    }

    // step 3: creating method getIntegers
    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r"); // \r means goes to the next line
        int[] values = new int[number];

        // step 4: create for-loop
        for (int i = 0; i < values.length; i++) {
            // scanner.nextInt accepts an integer from the console and that then returns an integer, and that's going to
            // be stored in the array
            values[i] = scanner.nextInt();
        }
        return values; // return the array back to the calling process
    }

    // step 6: creating method getAverage
    // using double because with an average we may get a number that's not a whole number as result
    public static double getAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            // += means that we're adding to it
            sum += array[i];
        }
        return (double) sum / (double) array.length;
    }
}