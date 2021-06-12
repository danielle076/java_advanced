## Methods

A method is a block of code that is executed only when it is called.
The main method is called automatically.

It is possible to pass data, also called parameters, to a method.

Methods are used to reuse code: define the code once and use it multiple times.

From the main method you call the different methods.

### Method declaration explained

    public static void main (String[] args) {    
        System.out.println("Hello World");    
    }

- Modifier: `public static`
- Return type: `void`
- Method name: `main`
- Parameters: `String[] args`
- Method body: `System.out.println()`

### Example

Step 1: make variables

    boolean gameOver = true;
    int score = 800;
    int levelCompleted = 5;
    int bonus = 100;

Step 2: create a method calculateScore

You can't put a method in another method, so you create a new one make him inside the public class. Between `()` are the variables of the first method main.

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }
    }

Step 3: call the method

Between `()` are the values and the names of the variables of the main method.

    calculateScore(true, 800, levelCompleted, bonus); // Your final score was 2300

Call the method with other values.

    calculateScore(true, 10000, 8, 200); // Your final score was 12600

Step 4: you don't have to write out variables separately anymore, you do that at the `calculateScore2` method.

    package C_Methods;
    
    public class ContinueMainOne {
        public static void main(String[] args) {
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

Step 5: make `void` an `int`. so you can `return` information.

    package C_Methods;
    
    public class ContinueMainTwo {
    public static void main(String[] args) {
    calculateScore3(true, 500, 4, 500); // Your final score was 3500
    calculateScore3(true, 1000, 2, 100); // Your final score was 2200
    }
    
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

You put `return -1` because with this you say that if the outcome is negative, it comes out at this line, there is always something in it. Algorithms negative 1 indicates an invalid value or a value not found so

## Challenge
 
Create a method called `displayHighScorePosition`. This has a player name as a parameter, and a second parameter as the position in the high score table. <br/>
Display the player's name along with a message "managed to get into position", the position they got and a message "on the high score table". <br/>

Create a second method, called `calculateHighScorePosition`. This has only one argument, the player's score, and must return an `int`.

The return data are: 
1. if the score is >=1000
2. if the score is >=500 and < 1000
3. if the score is >=100 and < 500
4. in all other cases

Call both methods and display the results: a score of 1500, 900, 400 and 50.