## Method Overloading

Use the same method name but with different parameters.

## Example

Method `calculateScore` has been used three times and that is only possible because all three are unique.

    package D_MethodOverloading;
    
    public class Main {
    
        public static void main(String[] args) {
            int newScore = calculateScore("Time", 500);
            System.out.println("New score is " + newScore); // New score is 500000

            calculateScore(75);

            calculateScore();
        }
        public static int calculateScore(String playerName, int score){
            System.out.println("Player " + playerName + " scored " + score + " points"); // Player Tim scored 500 points
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

When you don't print the return it is: `calculateScore ("Tim", 500);` <br/>
When you print out the return it is:<br/>
`int newScore = calculateScore("Tim", 500);` <br/>
`System.out.println("New score is " + newScore);`

`calculateScore(75);` calling the second calculateScore method

`calculateScore();` calling the third calculateScore method

## Challenge

Create a method called `calcFeetAndInchesToCentimeters`. This must have two parameters: `feet` and `inches`.

The first parameter is feet >= 0 is. <br/>
The second parameter is inches >=0 and <=12.<br/>
Return -1 from the method if any of the above values is not true.

If the parameters are valid, calculate how many centimeters feet and inches consist of, passed to this method and return that value.

Create a second method with the same name, but with only one parameter. <br/>
Inches is the parameter, validate it >=0.  <br/>
Return -1 if false, but if valid, calculate how many feet are in inches.<br/>

Call the other overload method, and pass the correct feet and inches calculation.

<i>Tips:<br/>
- Use double for your number datatypes. <br/>
-  inch = 2.54 cm and one feet = 12 inches.<br/>
- If you call another overloaded method, you just need to use the correct number of parameters. </i>