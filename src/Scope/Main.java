package Scope;

public class Main {

    public static void main(String[] args) {
        // step 4: create new instance: this is the local variable of Main.java
        // privateVar in Main.java and privateVar in ScopeCheck.java are not the same (!)
        String privateVar = "this is private to main()";

        // step 5: create an instance of ScopeCheck
        ScopeCheck scopeInstance = new ScopeCheck();
        System.out.println("scopeInstance privateVar is " + scopeInstance.getPrivateVar()); // privateVar from ScopeCheck.java
        System.out.println(privateVar); // privateVar local variable from Main.java
        // outcome:
        // ScopeCheck created, publicVar = 0: privateVar = 1 --> prints from constructor ScopeCheck.java, thanks to "ScopeCheck scopeInstance = new ScopeCheck();" in Main.java
        // scopeInstance privateVar is 1 --> prints from Main.java with variables from ScopeCheck.java
        // this is private to main() --> prints from Main.java with local variable

        // step 7: print out method
        // it uses the privateVar from within the method and not the other two
        scopeInstance.timesTwo();
    }
}
