package Constructor;

public class Account {
    // step 1: creating variables
    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    // step 8: constructor to put in the info from step 7
    // public Account(): you don't need void with a constructor, only public
    // public Account(): type in the name of the class for your constructor 'Account()'
    public Account(String number, double balance, String customerName, String customerEmailAddress,
                   String customerPhoneNumber) {
        System.out.println("Account constructor with parameters called");
        // step 9: setting the field values in the constructor
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    // step 12: make another constructor
    // make sure you update the variables you don't use, so number and balance
    public Account(String customerName, String customerEmailAddress, String customerPhoneNumber) {
        this("99999", 200, customerName, customerEmailAddress, customerPhoneNumber);
    }

    // step 3: method deposit
    // use this to make sure that this is the field that we're updating
    // balance = depositAmount is going to replace the amount, so use balance += depositAmount is add to the balance by using the plus equal operator
    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.balance);
    }

    // step 4: method withdrawal
    // use if to test to see whether there was sufficient funds available to process the withdrawal
    public void withdrawal(double withdrawalAmount) {
        if (this.balance - withdrawalAmount < 0) {
            System.out.println("Only " + this.balance + " available. Withdrawal not processed");
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " processed, Remaining balance = " + this.balance);
        }
    }

    // step 2: getters and setters
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}
