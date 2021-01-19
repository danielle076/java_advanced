package Encapsulation.Encapsulation;

public class Player {
    // step 1: creating variables
    // we are using public instead of private
    public String name;
    public int health;
    public String weapon;

    // step 2: not using a constructor

    // step 3: method loseHealth
    public void loseHealth(int damage) {
        this.health = this.health - damage;
        if(this.health <=0) {
            System.out.println("Player knocked out");
            // Reduce number of lives remaining for the player
        }
    }

    // step 4: method healthRemaining
    public int healthRemaining() {
        return this.health;
    }
}

