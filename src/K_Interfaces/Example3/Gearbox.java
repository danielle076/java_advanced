package K_Interfaces.Example3;

public class Gearbox {
    private boolean clutchIsIn;

    // step 1: method operateClutch
    // public void operateClutch(String inOrOut) {
    //        this.clutchIsIn = inOrOut.equalsIgnoreCase("in");

    // step 2: changed String to boolean and deleted '.equalsIgnoreCase("in")' from step 1
    public void operateClutch(boolean inOrOut) {
        this.clutchIsIn = inOrOut;
    }
}

// step 3: solve the problem with an interface

// step 4: create an interface