package I_Inheritance.Challenge1.overerving;

public class SpaceXRocket extends Rocket {
    // Here we call the constructor of Rocket
    public SpaceXRocket(int maximumFuel) {
        super(maximumFuel);
    }

    @Override
    public int calculateMetersFlown(int fuel) {

        return super.calculateMetersFlown(fuel) + fuel * 50;
    }
}