package B_Methods;

public class ContinueMainOne {
    public static void main(String[] args) {
        // you don't have to write out variables separately anymore, you do that at the calculateScore2 method
        calculateScore2(true, 500, 3, 100); // Your final score was 1800
        calculateScore2(true, 5000, 6, 500); // Your final score was 9000
    }

    public static void calculateScore2(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }
    }
}

