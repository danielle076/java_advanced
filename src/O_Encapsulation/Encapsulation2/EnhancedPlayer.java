package O_Encapsulation.Encapsulation2;

public class EnhancedPlayer {
    // step 6: creating variables
    // we are using private instead of public
    private String name;
    private int hitPoints = 100; // this was health, changed to hitpoints
    private String weapon;

    // step 7: creating a constructor
    // making a validation for health
    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;

        if(health >0 && health <= 100) {
            this.hitPoints = health;
        }

        this.weapon = weapon;
    }

    // step 8: method loseHealth
    public void loseHealth(int damage) {
        this.hitPoints = this.hitPoints - damage;
        if(this.hitPoints <=0) {
            System.out.println("Player knocked out");
            // Reduce number of lives remaining for the player
        }
    }

    // step 9: getter
    public int getHealth() {
        return hitPoints;
    }
}

// we've got some validation, which we weren't able to do if we weren't using encapsulation.
// this is encapsulation, by making our fields private, we're making sure that our class is not accessible, or the
// fields within the class aren't accessible to any classes that are outside

// this is another cool feature encapsulation, we can make all these changes to this enhanced player class, we can
// create private fields and private functions that we don't want to be exposed to any other class, and we can change
// those names at any time in this code without affecting any other code
// that's really one of the huge benefits of encapsulation, is that you're not actually affecting any other code