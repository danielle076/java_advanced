package O_Encapsulation.Encapsulation1;

public class Main {

    public static void main(String[] args) {
        // encapsulation is the mechanism that allows you to restrict access to certain components in the objects that you are creating
        // you're able to protect the members of a class from external access in order to guard against unauthorized access

        // we're gonna start off with the class that doesn't use it: player.java
        // and then we're gonna create an enhanced class that does use it: enhancedplayer.java

        // step 5: create an instance
        Player player = new Player();
        // we haven't created the constructor, and because we haven't created a constructor, a default constructor with
        // no parameters has been created for you. So we now need to manually set those fields, set the values for those fields
        player.name = "Tim";
        player.health = 20;
        player.weapon = "Sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health =  " + player.healthRemaining());

        damage = 11;
        player.health = 200; // problem: with this we're taking the control out of the player class
        // by being able to access those fields directly you're opening up your application to be accessed in ways
        // that you didn't want it to do
        player.loseHealth(damage);
        System.out.println("Remaining health =  " + player.healthRemaining());
    }
}
