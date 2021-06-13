package O_Encapsulation.Encapsulation2;

public class EnhancedPlayer {
    // step 6: creating variables
    private String name;
    private int hitPoints = 100; // this was health, changed to hitpoints
    private String weapon;

    // step 7: creating a constructor
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
        }
    }

    // step 9: getter
    public int getHealth() {
        return hitPoints;
    }
}