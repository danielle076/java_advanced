package R_FinalStatement;

public class SomeClass {
    // step 1: variables
    private static int classCounter = 0;
    public final int instanceNumber;
    private final String name;

    // step 2: constructor
    public SomeClass(String name) {
        this.name = name;
        classCounter++;
        instanceNumber = classCounter;
        System.out.println(name + " created, instance is " + instanceNumber);
    }

    // step 3: getter
    public int getInstanceNumber() {
        return instanceNumber;
    }
}

