package Array;

// arrays: data structure that allows you to store sequence of values, that are all of the same type

public class BasicsArrays {
    public static void main(String[] args) {
        // declaring an array initially is similar to declaring a regular variable
        int myVariableInt = 50;

        // define an array you put square brackets after int. That tells the Java compiler that we're not dealing with a
        // regular variable, but with an array. And delete "= 50", which is illegal for an array
        int[] myVariableArray;

        // put in the number of elements we want to assign in the array
        myVariableArray = new int[10];

        // compile the two lines together
        int[] myVariableArray2 = new int[10];

        // accessing the array elements
        // this is saving the value 50 into element 6, because arrays in Java always start the count at position 0
        myVariableArray2[5] = 50;

        // retrieve a value from a particular element
        System.out.println(myVariableArray2[5]); // gives 50

        // if you want to initialize every value in the array, you can do myVariableArray2[0] = 50;,
        // myVariableArray2[1] = 50; etc. But thats a lot of work
        // we told Java these are the numbers we want you to assign into the array. But we've also indirectly told Java
        // how many elements are in that array by the actual number of values that are in this curly brace initializer
        // block here, separated by commas
        int[] myVariableArray3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Java assigns ten elements to this integer array and then it also goes through and adds the values
        // for each of those into each array element
        System.out.println(myVariableArray3[0]); // position 1
        System.out.println(myVariableArray3[6]); // position 7
        System.out.println(myVariableArray3[8]); // position 9

        // third way to initialize, with for loop
        // we're going through each element of the array starting from element zero with our for loop. And you
        // can see myVariableArray4[i], i in brackets means access element, so in this case 0 will be the first time it's
        // called through in the loop. We're assigning i times 10 to it. We're going right through for the entire array,
        // and going through so in the values
        int[] myVariableArray4 = new int[10];
        for (int i = 0; i < 10; i++) {
            myVariableArray4[i] = i * 10;
            System.out.println("Element " + i + ", value is " + myVariableArray4[i]);
            // gives:
            // Element 0, value is 0
            // Element 1, value is 10
            // Element 2, value is 20
            // Element 3, value is 30
            // Element 4, value is 40
            // Element 5, value is 50
            // Element 6, value is 60
            // Element 7, value is 70
            // Element 8, value is 80
            // Element 9, value is 90
        }

        // array.length: length gives us the length automatically
        // it's a good idea to use .length with arrays whenever you want to cycle through or figure out what the
        // length is rather than hard-coding a value = [10]
        int[] myVariableArray5 = new int[25]; // change [10] into [25]
        for (int i = 0; i < myVariableArray5.length; i++) {
            myVariableArray5[i] = i * 10;
            System.out.println("Number " + i + ", value is " + myVariableArray5[i]);
        }
    }
}