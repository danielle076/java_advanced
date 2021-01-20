package Scope;

public class ScopeCheck {
    // scope refers to the visibility of a class, member, or variable

    // imagine you're going to buy a computer, and you find a local store and it's got the computer for 20% off. The
    // same computer in another store would still be at the full price. So the scope, or the price reduction is just
    // that one local store.
    // but, if Walmart decided to discount a particular computer, the discount then would actually apply in about 4,500
    // stores across America. In that context the scope of the discount is therefore much much wider. If they applied
    // the discount world wide, the scope would be over 11,000 stores. The important thing here is that Walmart's discount
    // does not apply to any ther stores. The scope is limited to the stores controlled only by Walmart.

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
