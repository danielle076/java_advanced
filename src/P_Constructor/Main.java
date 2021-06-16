package P_Constructor;

public class Main {

    public static void main(String[] args) {
        // step 5: Account bobsAccount = new Account();
        // step 10: use parameters from the constructor
        Account bobsAccount = new Account("12345", 0.00, "Bob Brown", "myemail@bob.com", "(087) 123-4567");

          // step 7
//        bobsAccount.setNumber("12345");
//        bobsAccount.setBalance(0.00);
//        bobsAccount.setCustomerName("Bob Brown");
//        bobsAccount.setCustomerEmailAddress("my@email.com");
//        bobsAccount.setCustomerPhoneNumber("080-1234567");

        // step 11: print out the parameters from step 10
        System.out.println(bobsAccount.getNumber());
        System.out.println(bobsAccount.getBalance());

        // step 6: testing if it works
        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(50.0);
        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(51.0);
        bobsAccount.withdrawal(100.0);

        // step 13: call the constructor and print
        Account danisAccount = new Account("Danielle", "name@email.com", "12345");
        System.out.println(danisAccount.getNumber() + " email " + danisAccount.getCustomerEmailAddress());
    }
}

