package C_Methods;

public class MainContinueTwo {
    public static void main(String[] args) {
        calculateScore3(true, 500, 4, 500); // Your final score was 3500
        calculateScore3(true, 1000, 2, 100); // Your final score was 2200
    }

    // step 5: make void an int so you can return information
    public static int calculateScore3(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
            return finalScore; // this sends back the finalScore to calculateScore3 in Main3
        }
        return -1;
    }
}


