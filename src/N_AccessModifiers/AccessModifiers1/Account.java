package N_AccessModifiers.AccessModifiers1;

import java.util.ArrayList;

public class Account {
    // step 2: variables
    public String accountName;
    public int balance = 0;
    public ArrayList<Integer> transactions;

    // step 3: constructor + initialize transactions
    public Account(String accountName) {
        this.accountName = accountName;
        this.transactions = new ArrayList<Integer>();
    }

    // step 4: getter
    public int getBalance() {
        return balance;
    }

    // step 5: method deposit
    public void deposit(int amount) {
        if (amount > 0) {
            transactions.add(amount);
            this.balance += amount;
            System.out.println(amount + " deposited. Balance is now " + this.balance);
        } else {
            System.out.println("Cannot deposit negative sums");
        }
    }

    // step 6: method withdraw
    public void withdraw(int amount) {
        int withdrawal = -amount;
        if (withdrawal < 0) {
            this.transactions.add(withdrawal);
            this.balance += withdrawal;
            System.out.println(amount + " withdrawn. Balance is now " + this.balance);
        } else {
            System.out.println("Cannot withdraw negative sums");
        }
    }

    // step 7: method calculateBalance
    public void calculateBalance() {
        this.balance = 0;
        for (int i : this.transactions) {
            this.balance += i;
        }
        System.out.println("Calculated balance is " + this.balance);
    }
}
