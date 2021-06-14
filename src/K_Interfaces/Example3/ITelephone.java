package K_Interfaces.Example3;

public interface ITelephone {
    // step 5: define the methods
    public void powerOn();
    public void dial(int phoneNumber);
    public void answer();
    public boolean callPhone(int phoneNumber);
    public boolean isRinging();
}
