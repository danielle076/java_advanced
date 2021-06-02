package I_Composition;

public class PC {
    // step 22: create a class that is comprised of the case, the monitor, and the motherboard
    // step 23: instead of using extends we're going to type private Case theCase; private Monitor monitor; and private Motherboard motherboard;
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    // step 24: create an instructor
    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    // step 25: getters
    public Case getTheCase() {
        return theCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }
}

// this is another composition. We've created a new class called PC
// it has a case so that's theCase variable which is the field that we have defined
// it has a monitor, a field monitor, and a field called monitor and of course it has a motherboard
// and you can see the obvious advantage here, because if you're using the extends option to inherit, you can only inherit from one class at a time
