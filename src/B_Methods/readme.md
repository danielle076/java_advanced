## B_Methods

A method is a block of code that is executed only when it is called.
The main method is called automatically.

It is possible to pass data, also called parameters, to a method.

B_Methods are used to reuse code: define the code once and use it multiple times.

### Methode declaratie uitgelegd

    public static void main (String[] args) {    
        System.out.println("Hello World");    
    }

- Modifier: `public static`
- Return type: `void`
- Method name: `main`
- Parameters: `String[] args`
- Method body: `System.out.println()`

## Challenge
 
Create a method called `displayHighScorePosition`. <br/>
It should have a players name as a parameter, and a second parameter as a position in the high score table. <br/>
You should display the players name along with a message like "managed to get into position", the position they got and a message "on the high score table". <br/>

Create a second method called `calculateHighScorePosition`.<br/>
It should be sent one argument only, the player score, and it should return an `int`.<br/>
The return data should be: <br/>
1. if the score is >=1000
2. if the score is >=500 and < 1000
3. if the score is >=100 and < 500
4. in all other cases 

Call both methods and display the results of the following: <br/>
A score of 1500, 900, 400 and 50
