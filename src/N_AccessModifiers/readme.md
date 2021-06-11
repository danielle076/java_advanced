## Access Modifiers

Access modifiers: keywords private, public, protected.

With the access modifiers, you determine which other code can access your code.

- If you want to make your code (for example a method) accessible to everyone, then use `public`
- If you want your instance variables or methods to be accessible only within the class, use `private`.
- In addition, `protected` allows you to make the code accessible to all subclasses and the code in the same package.

### Example AccessModifiers1

_Account.java_ <br/>
step 1: create class Account.java <br/>
step 2: variables <br/>
step 3: constructor + initialize transactions <br/>
step 4: getter <br/>
step 5: method deposit <br/>
step 6: method withdraw <br/>
step 7: method calculateBalance <br/>

_Main.java_ <br/>
step 8: doing transactions <br/>
step 9: change the account balance <br/>

### Example AccessModifiers2

_Account.java_ <br/>
step 10: making private instead of public

_Main.java_ <br/>
step 11: making the variables from Account private gives 'balance' and 'transactions' an error in Main <br/>
step 12: you can't define a private class at the top level

_PrivateClass_ <br/>
step 13: making public class PrivateClass private

## Challenge

In the following interface declaration, what is the visibility of:

1. the Accessible interface?
2. the int variable SOME_CONSTANT?
3. methodA?
4. methodB and methodC?


