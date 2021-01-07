package Methods;

public class MainChallenge {

    public static void main(String[] args) {
        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Henk", highScorePosition); // Henk managed to get into position 1 on the high score table

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Karin", highScorePosition); // Karin managed to get into position 2 on the high score table

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Daisy", highScorePosition); // Daisy managed to get into position 3 on the high score table

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Jan", highScorePosition); // Jan managed to get into position 4 on the high score table

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Stijn", highScorePosition); // Stijn managed to get into position 1 on the high score table

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Manon", highScorePosition); // Manon managed to get into position 2 on the high score table

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Freckle", highScorePosition); // Freckle managed to get into position 3 on the high score table
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position "
                + highScorePosition + " on the high score table");
    }

    // it is important that you write >= instead of > because then people with 1000, 500 and 100 will all fall into place 4
    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        } else {
            return 4;
        }
    }
}