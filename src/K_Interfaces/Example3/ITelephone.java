package K_Interfaces.Example3;

public interface ITelephone {
    // public interface ITelephone: instead of class it says interface
    // step 5: define the methods, that are going to be used in this interface that when a class implements this interface
    // needs to actually implement
    public void powerOn();
    public void dial(int phoneNumber);
    public void answer();
    public boolean callPhone(int phoneNumber);
    public boolean isRinging();
}

// these are the parameters, the name, the return type and any parameters, but we're not actually defining the actual
// code itself. That still goes into the class that inherits this interface

// you can delete the public, because these parameters are in the class, you don't need them here