package Q_Static.Example.StaticStatement2;

public class StaticTest {
    // step 6: change 'private int numInstances = 0;' into 'private static int numInstances = 0;'
    private static int numInstances = 0;
    private String name;

    public StaticTest(String name) {
        this.name = name;
        numInstances++;
    }

    public int getNumInstances() {
        return numInstances;
    }

    public String getName() {
        return name;
    }
}

