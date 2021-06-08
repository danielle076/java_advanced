## Scope

Scope refers to the visibility of a class, member, or variable.

Imagine you're going to buy a computer, and you find a local store and it's got the computer for 20% off. The same computer in another store would still be at the full price. So the scope, or the price reduction is just  that one local store. But, if Walmart decided to discount a particular computer, the discount then would actually apply in about 4,500 stores across America. In that context the scope of the discount is therefore much much wider. If they applied the discount world wide, the scope would be over 11,000 stores. The important thing here is that Walmart's discount does not apply to any ther stores. The scope is limited to the stores controlled only by Walmart.

### Example

<i>ScopeCheck.java</i>

Step 1: variables

    public int publicVar = 0;
    private int privateVar = 1;

Step 2: constructor

    public ScopeCheck() {
        System.out.println("ScopeCheck created, publicVar = " + publicVar + ": privateVar = " + privateVar);
    }

Step 3: getter

    public int getPrivateVar() {
        return privateVar;
    }

<i>Main.java</i>

Step 4: create new instance: this is the local variable of Main.java

> privateVar in Main.java and privateVar in ScopeCheck.java are not the same (!)

    String privateVar = "this is private to main()";

Step 5: create an instance of ScopeCheck

    ScopeCheck scopeInstance = new ScopeCheck();
    System.out.println("scopeInstance privateVar is " + scopeInstance.getPrivateVar()); // privateVar from ScopeCheck.java
    System.out.println(privateVar); // privateVar local variable from Main.java

Outcome: <br/>
ScopeCheck created, publicVar = 0: privateVar = 1 --> prints from constructor ScopeCheck.java, thanks to "ScopeCheck scopeInstance = new ScopeCheck();" in Main.java <br/>
scopeInstance privateVar is 1 --> prints from Main.java with variables from ScopeCheck.java <br/>
this is private to main() --> prints from Main.java with local variable

<i>ScopeCheck.java</i>

Step 6: method timesTwo

    public void timesTwo() {
        int privateVar = 2; // not the same pivateVar as the other two, this one is local to this method
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " times two is " + i * privateVar);
        }
    }

<i>Main.java</i>

Step 7: print out method

It uses the privateVar from within the method and not the other two.

    scopeInstance.timesTwo();