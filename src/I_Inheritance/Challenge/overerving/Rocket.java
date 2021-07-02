package I_Inheritance.Challenge.overerving;

public class Rocket {
    public int maximumFuel;
    public int currentFuel;
    public int height = 0;

    public Rocket(int maximumFuel) {
        this.maximumFuel = maximumFuel;
        this.currentFuel = maximumFuel;
    }

    public void fly(int fuel) {
        int metersFlown = 0;
        if (hasEnoughFuel(fuel)) {
            metersFlown = calculateMetersFlown(fuel);
            decreaseFuel(fuel);
        }
        this.height = height + metersFlown;
    }

    public int calculateMetersFlown(int fuel) {
        return fuel * 100;
    }

    public void decreaseFuel(int fuel) {
        currentFuel = currentFuel - fuel;
    }

    public boolean hasEnoughFuel(int fuel) {
        if (fuel < currentFuel) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "The Rocket is flying at an altitude of " + this.height + " meters.";
    }
}