package AccessModifiers.AccessModifiers2;

public class Main {

    public static void main(String[] args) {
        // step 11: making the variables from Account private gives 'balance' and 'transactions' an error in Main
        // we are now only allowed to use the methods deposit and withdrawal
        Account daniellesAccount = new Account("Danielle");
        daniellesAccount.deposit(1000);
        daniellesAccount.withdraw(500);
        daniellesAccount.withdraw(-200);
        daniellesAccount.deposit(-20);
        daniellesAccount.calculateBalance();

//        daniellesAccount.balance = 5000; // error
        System.out.println("Balance on account is " + daniellesAccount.getBalance());
//        daniellesAccount.transactions.add(4500); error
        daniellesAccount.calculateBalance();
    }
}

// step 12: you can't define a private class at top level. So let's try and do that: we create a new private class PrivateClass.java