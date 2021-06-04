package Interfaces.Example3;

public class Gearbox {
    private boolean clutchIsIn;

    // step 1: method operateClutch
    // a parameter called in or out. If the string value is set to the value 'in' then clutch boolean field is set to true otherwise it's set to false
    // public void operateClutch(String inOrOut) {
    //        this.clutchIsIn = inOrOut.equalsIgnoreCase("in");

    // step 2: changed String to boolean and deleted '.equalsIgnoreCase("in")'
    // the method code has changed, problem: if you've got some other code that is reliant, that needs to change aswell
    public void operateClutch(boolean inOrOut) {
        this.clutchIsIn = inOrOut;
    }
}

// step 3: solve the problem with an interface
// an interface is a commitment that the method's signatures and variables in the interface constants (if defined) will not change

// step 4: create an interface
// ITelephone.java is the interface: I stands for Interface