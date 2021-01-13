package ReadingUserInput;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // scanner is a simple text scanner that can pass both Primitive types and Strings
        // scanner is one of Java's built-in classes and it allows us to read user import

        // scanning: the variable we are going to use
        // new keyword: we are creating a new object of type scanner
        // System.in: allows you to put info into the console, which then gets returned back to the program
        Scanner scanning = new Scanner(System.in);
        System.out.println("Enter your name: ");
        // .nextline is to read a line of input from the console
        String name = scanning.nextLine();

        // after the .nextLine method print out another message with retrieved information from the console (thanks to next.Line)
        System.out.println("Hi " + name);

        // close the scanner after your done with it
        scanning.close();
    }
}
