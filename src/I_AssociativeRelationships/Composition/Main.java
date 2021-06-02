package I_AssociativeRelationships.Composition;

public class Main {

    public static void main(String[] args) {
	    // composition is a component of object orientated programming
        // inheritance deals with a is a relationship
        // composition deals with a has a relationship
        // example: a motherboard, a case, and a monitor are not computers in the same sense that a Car is a Vehicle,
        // a computer has a motherboard, a computer has a case, and a computer has a monitor
        // so that's what composition is, is actually modeling parts, parts of the greater whole

        // step 1: creating classes case.java, motherboard.java and monitor.java

        // step 26: running code
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("2208", "Dell", "240", dimensions);

        // create an instance of a class without using a variable type: 'new Resolution (2540, 1440)
        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));

        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        // step 27: call the methods
        thePC.getMonitor().drawPixelAt(1500, 1200, "red" );
        thePC.getMotherboard().loadProgram("Windows 1.0");
        thePC.getTheCase().pressPowerButton();
    }
}

