package ParsingValuesFromString;

public class Main {

    public static void main(String[] args) {
	    // parsing values from a String: convert the String into a primitive data type
        // defining a String, it's interpreted as text and not as a number
        // goal: convert this piece of text into a number
        String numberAsString = "2018.125";
        System.out.println("numberAsString= " + numberAsString);

        // with parsing method you convert a String into a number
        // you know that you use a class Double because it starts with a capital letter
        // this class uses a method .parseDouble that converts the String to a number
        double number = Double.parseDouble(numberAsString);
        System.out.println("number = " + number);

        // calculate with the variables String and double
        numberAsString += 1; // zet een 1 achter het getal
        number += 1; // telt een 1 op bij het getal

        System.out.println("numberAsString = " + numberAsString); // 2018.1251
        System.out.println("number = " + number); // 2019.125
    }
}
