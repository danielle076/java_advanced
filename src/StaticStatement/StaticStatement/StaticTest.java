package StaticStatement.StaticStatement;

public class StaticTest {
    // step 2: variables
    private int numInstances = 0;
    private String name;

    // step 3: constructor
    public StaticTest(String name) {
        this.name = name;
        numInstances++;
    }

    // step 4: getters
    public int getNumInstances() {
        return numInstances;
    }

    public String getName() {
        return name;
    }
}

