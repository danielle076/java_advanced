package Arraylist;

import java.util.Scanner;

public class Main {
    // step 7 adding Scanner
    private static Scanner scanner = new Scanner(System.in);
    // step 8 adding the GroceryList
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        // step 9 variables ??
        boolean quit = false;
        int choice = 0;

        // step 10 while loop
        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            // step 11 switch, the methods are listed
            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    // step 12 method printInstructions
    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To quit the application.");
    }

    // step 13 method addItem
    public static void addItem() {
        System.out.print("Please enter the grocery item: ");
        // what the user has typed we are going to add that as an item to the groceryList
        groceryList.addGroceryItem(scanner.nextLine());
    }

    // step 14 method modifyItem
    public static void modifyItem() {
        System.out.print("Enter item number: ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter replacement item: ");
        String newItem = scanner.nextLine();
        // why -1? An array starts at 0, so to access the right number -1
        groceryList.modifyGroceryItem(itemNo - 1, newItem);
    }

    // step 15 method removeItem
    public static void removeItem() {
        System.out.print("Enter item number: ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        groceryList.removeGroceryItem(itemNo - 1);
    }

    // step 16 method searchForItem
    public static void searchForItem() {
        System.out.print("Item to search for: ");
        String searchItem = scanner.nextLine();
        // != means not equal to
        if (groceryList.findItem(searchItem) != null) {
            System.out.println("Found " + searchItem + " in our grocery list");
        } else {
            System.out.println(searchItem + " is not in the shopping list");
        }
    }
}