package FinalStatement;

// step 7: this is an example of why you'd want to prevent one of your methods from being overwritten

public class Password {
    // step 8: variables
    private static final int key = 748576362; // could be any number
    private final int encryptedPassword;

    // step 9: constructor
    // we'll pass the password in the constructor. We'll also have an encrypt function so the password would come in
    // just as a password and encrypted and move our function to encrypt the password. So I'm writing a function that
    // will encrypt or decrypt and then save it into the encrypted password, which is encrypted at that point
    public Password(int password) {
        this.encryptedPassword = encryptDecrypt(password);
    }

    // step 10: setting a parameter of the password, which return password
    private int encryptDecrypt(int password) {
        return password ^ key;
    }

    // step 11: we'll store the passwords
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

