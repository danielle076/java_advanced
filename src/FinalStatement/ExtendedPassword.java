package FinalStatement;

// step 15: what would prevent us for someone from extending the Password class and then changing the Method itself
public class ExtendedPassword extends Password {
    // step 16: variables
    private int decryptedPassword;

    // step 17: constructor
    public ExtendedPassword(int password) {
        super(password);
        this.decryptedPassword = password;
    }

    // step 18: override the store password method
    @Override
    public void storePassword() {
        System.out.println("Saving password as " + this.decryptedPassword);
    }
}
