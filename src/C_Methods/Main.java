package C_Methods;

public class Main {

    public static void main(String[] args) {
        // step 1: make variables
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        // step 3: call the method
        // between () are the values and the names of the variables of the main method
        calculateScore(true, 800, levelCompleted, bonus); // Your final score was 2300
        // call the method with other values
        calculateScore(true, 10000, 8, 200); // Your final score was 12600
    }

    // step 2: create a method calculateScore
    // you can't put a method in another method, so you create a new one make him inside the public class
    // between () are the variables of the first method main
    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }
    }
}
