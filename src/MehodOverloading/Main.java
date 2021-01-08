package MehodOverloading;

public class Main {

    public static void main(String[] args) {
	    // method overloading: use the same method name but with different parameters
        // below method calculateSCore has been used 3x and that is only possible because all three are unique

        // when you don't print the return it is: calculateScore ("Tim", 500);
        /* when you print out the return it is:
        int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore); */
        int newScore = calculateScore("Time", 500);
        System.out.println("New score is " + newScore); // New score is 500000

        // calling the second calculateScore method
        calculateScore(75);

        // calling the third calculateScore method
        calculateScore();
    }
    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points"); // Player Time scored 500 points
        return score * 1000;
    }
    public static int calculateScore(int score){
        System.out.println("Unnamed player scored " + score + " points"); // Unnamed player scored 75 points
        return score * 1000;
    }
    public static int calculateScore(){
        System.out.println("No player name, no player score"); // No player name, no player score
        return -1;
    }
}
