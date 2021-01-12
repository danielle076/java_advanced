package WhileAndDoWhile;

public class MainChallenge {
    public static void main(String[] args) {
        // Print challenge 1
        int number = 4;
        int finishNumber = 20;

        while (number <= finishNumber) {
            number++; // increment the number so it starts with 5 and not 4 (actually 6)
            // test that the number is not even (odd number) !isEvenNumber means = not isEvenNumber
            if (!isEvenNumber(number)) {
                continue; // it causes the loop to immediately jump to the next iteration of the loop
            }
            System.out.println("Even number " + number);
        }

        System.out.println("********");

        // Challenge 2
        int number2 = 5;
        int finishNumber2 = 20;
        int evenNumbersFound = 0;
        while (number2 <= finishNumber2) {
            if (!isEvenNumber(number2)) {
                number2++;
                continue;
            }
            System.out.println("Even number " + number2);
            number2++;

            evenNumbersFound++;
            if (evenNumbersFound >= 5) {
                break;
            }
        }
        System.out.println("Total even numbers found = " + evenNumbersFound);
    }

    // Challenge 1
    public static boolean isEvenNumber(int number) {
        if ((number % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }
}





