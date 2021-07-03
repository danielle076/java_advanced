package I_Inheritance.Challenge2.overerving;

public class ApolloRocket extends Rocket {

    public int amountOfRocketEngines;

    // Here we call the constructor of Rocket
    public ApolloRocket(int maximumFuel, int amountOfRocketEngines) {
        super(maximumFuel);
        this.amountOfRocketEngines = amountOfRocketEngines;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());

        sb.append("\r\n"); // New line

        sb.append("This rocket has " + this.amountOfRocketEngines + " rocket engines");

        return sb.toString();
    }
}
