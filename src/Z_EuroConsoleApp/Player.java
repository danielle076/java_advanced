package Z_EuroConsoleApp;

public class Player extends  Person {
    private int position = 0;

    public Player(String firstName, String lastName, int age, int position) {
        super(firstName, lastName, age);
        this.position = position;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
