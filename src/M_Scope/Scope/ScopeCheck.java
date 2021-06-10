package M_Scope.Scope;

public class ScopeCheck {
    // step 1: variables
    public int publicVar = 0;
    private int privateVar = 1;

    // step 2: constructor
    public ScopeCheck() {
        System.out.println("ScopeCheck created, publicVar = " + publicVar + ": privateVar = " + privateVar);
    }

    // step 3: getter
    public int getPrivateVar() {
        return privateVar;
    }

    // step 6: method timesTwo
    public void timesTwo() {
        int privateVar = 2; // not the same pivateVar as the other two, this one is local to this method
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " times two is " + i * privateVar);
        }
    }
}
