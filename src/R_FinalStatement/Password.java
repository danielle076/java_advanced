package R_FinalStatement;

// step 7: this is an example of why you'd want to prevent one of your methods from being overwritten

public class Password {
    // step 8: variables
    private static final int key = 748576362;
    private final int encryptedPassword;

    // step 9: constructor
    public Password(int password) {
        this.encryptedPassword = encryptDecrypt(password);
    }

    // step 10: parameter
    private int encryptDecrypt(int password) {
        return password ^ key;
    }

    // step 11: store the passwords
    // step 20: change 'public void storePassword' into 'public final void storePassword'
    public void storePassword() {
        System.out.println("Saving password as " + this.encryptedPassword);
    }

    // step 12: method to check if the password is valid
    public boolean letMeIn(int password) {
        if (encryptDecrypt(password) == this.encryptedPassword) {
            System.out.println("Welcome");
            return true;
        } else {
            System.out.println("Nope, you cannot come in");
            return false;
        }
    }
}

