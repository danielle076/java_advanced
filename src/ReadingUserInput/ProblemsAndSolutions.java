package ReadingUserInput;

import java.util.Scanner;

public class ProblemsAndSolutions {
    // what if the user enters a negative number for the year of birth
    // what will happen to the user if they enter some letters instead of only numbers

    public static void main(String[] args) {
        Scanner scanning = new Scanner(System.in);

        System.out.println("Enter your year of birth:");

        // has.NextInt checks to see if the input entered is a number, in this case an Integer
        boolean hasNextInt = scanning.hasNextInt();

        // check to see if the boolean .hasNextInt is true
        if (hasNextInt) {
            int yearOfBirth = scanning.nextInt();
            scanning.nextLine();

            System.out.println("Enter your name: ");
            String name = scanning.nextLine();
            int age = 2020 - yearOfBirth;

            // check a valid range: age range of 0 to 100 and if the age is not in that range, error message
            if (age >= 0 && age <= 100) {
                System.out.println("Your name is " + name + ", and you are " + age + " years old.");
            } else {
                System.out.println("Invalid year of birth");
            }
        } else {
            System.out.println("Unable to parse year of birth.");
        }
        scanning.close();
    }
}