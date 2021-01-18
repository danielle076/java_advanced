package Arraylist;

// the ArrayList (class) is a resizable array

import java.util.ArrayList;

public class GroceryList {

    // step 1: access our array list: define the type and then the variable name (private ArrayList), then we use
    // <>. Between <> you put the type of data that is going into the ArrayList, String. We call it groceryList
    private ArrayList<String> groceryList = new ArrayList<String>();

    // step 2: create method to add a grocery item
    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    // step 3: method to print the grocery list
    // .size() will return how many elements we currently have stored in the arraylist
    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for (int i = 0; i < groceryList.size(); i++) {
            // access a particular element, we use .get()
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }

    // step 4: method to modify (replace an item) in the arraylist
    public void modifyGroceryItem(int position, String newItem) {
        // with .set we replace an item in that position
        groceryList.set(position, newItem);
        // using position + 1 humans start counting from 1, but the computer always starts at 0 with its count
        System.out.println("Grocery item " + (position + 1) + " has been modified.");
    }

    // step 5: method to remove an item
    public void removeGroceryItem(int position) {
        // we're going to retrieve the item first so we can output it and tell people what item has been modified, and
        // we do that with groceryList.get(position)
        String theItem = groceryList.get(position);
        // removes an item at that position
        groceryList.remove(position);
    }

    // step 6: method to findItem in the Arrarylist
    public String findItem(String searchItem) {
        // ArrayList contains() method is used for checking if the specified element exists in the given list or not
        // between () you insert the item your searching
//        boolean exists = groceryList.contains(searchItem);

        // The indexOf() method returns the index of the first occurrence of the specified element in this list,
        // or -1 if this list does not contain the element
        // return a number corresponding to the index position in our ArrayList
        int position = groceryList.indexOf(searchItem);
        // if that number returned greater than equal to 0 we need to return it otherwise if it's not greater than equal
        // to 0 it means it has to be less than zero it is going to return null
        if (position >= 0) {
            return groceryList.get(position);
        }
        return null;
    }
}