package AccessModifiers.AccessModifiers1;

public class Main {

    /*  Access Modifiers:
        private
        public
        protected
        package private  */

    // step 1: create class Account.java

    public static void main(String[] args) {
        // step 8: doing transactions
        // everything's public in the Account class (account name, balance and transactions) and this allows any program
        // using the Account class to modify the balance directly
        Account daniellesAccount = new Account("Danielle");
        daniellesAccount.deposit(1000);
        daniellesAccount.withdraw(500);
        daniellesAccount.withdraw(-200);
        daniellesAccount.deposit(-20);
        daniellesAccount.calculateBalance();

        // step 9: change the account balance
        // we've changed the account balance being 5.000. That's obviously not good being able to do that. The
        // bank would spot the attempt at fraud when checking the transaction list, but we can modify that as well
        daniellesAccount.balance = 5000;
        System.out.println("Balance on account is " + daniellesAccount.getBalance());
        // we have a match of the account balance but also there's an entry in the transaction ArrayList. In a well
        // designed system, the transactions list, in this case the ArrayList, should only be modified by the deposit
        // and withdrawal methods. By allowing access to the transactions list from outside, the class and the balance,
        // we're creating errors in the program: in this case, fraud
        daniellesAccount.transactions.add(4500);
        daniellesAccount.calculateBalance();
    }
}
