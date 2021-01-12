package WhileAndDoWhile;

public class Main {

    public static void main(String[] args) {
        // when you don't know how many times you want to loop, you use the while statement
        // while statement compare with for statement
        int count = 1;
        while (count != 6) {
            System.out.println("While count value is " + count);
            count++; // difference with for loop is that you have to do the counting manually outside the method
        }

        System.out.println("********");

        // compare for statement with while statement
        for (int i = 1; i != 6; i++) {
            System.out.println("For count value is " + i);
        }

        System.out.println("********");

        // while statement written differently
        count = 1;
        while (true) { // while(true) means an infinite loop, processing forever
            if (count == 6) { // when we get to 6 we want to break out of the loop
                break;
            }
            System.out.println("While count value is " + count);
            count++;
        }

        // this while loop does not work because the expression is equal to the beginning number
        int count2 = 6;
        while (count2 != 6) {
            System.out.println("Count value is " + count);
            count++;
        }

        System.out.println("********");

        // do while example same as while and for
        // do while, advantage that it will always execute at least once
        count = 1;
        do {
            System.out.println("Do while count value was " + count);
            count++;
        } while (count != 6);

        System.out.println("********");

        // do while counts from 6 to 100
        count = 6;
        do {
            System.out.println("Do-while count value was " + count);
            count++;

            if (count > 100) {
                break;
            }
        } while (count != 6);
    }
}
