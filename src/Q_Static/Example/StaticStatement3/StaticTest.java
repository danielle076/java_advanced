package Q_Static.Example.StaticStatement3;

public class StaticTest {
    private static int numInstances = 0;
    private String name;

    public StaticTest(String name) {
        this.name = name;
        numInstances++;
    }

    // step 10: change 'public int' into 'public static int'
    public static int getNumInstances() {
        return numInstances;
    }

    public String getName() {
        return name;
    }
}

