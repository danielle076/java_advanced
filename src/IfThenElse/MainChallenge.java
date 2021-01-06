package IfThenElse;

public class MainChallenge {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        if (score < 5000) {
            System.out.println("Your score was less than 5000");
        } else {
            System.out.println("Great job");
        }

        if (score < 5000 && score > 1000) {
            System.out.println("Your score was less than 5000 but greater than 1000");
        } else if (score < 1000) {
            System.out.println("Your score was less than 1000");
        } else {
            System.out.println("Nice try");
        }

        // you are going to give the above variables new values, you don't have to create new variables
        // data type can be omitted
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus); // 10.000 + (8 * 200)
            System.out.println("Your final score was " + finalScore); // Your final score was 11600
        }
        // you are allowed to use finalScore 2 times, because Java 'removed' the first one between {} so you can use it again
    }
}
