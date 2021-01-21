package Interfaces.Interfaces1;

public class Main {

    public static void main(String[] args) {
        // an interface specifies methods that when a particular class implements the interface must implement

        // the interface itself is abstract. That means there's no code for any of the methods, you only
        // supply the method names and the parameters. The code still goes in the class that you're creating

        // use an interface to provide a common behavior that can be used by several classes by having them all implement
        // the same interface. So it's really a way to standardize the way a particular set of classes is used

        // step 10: create an instance
        // you can't do: 'ITelephone timsPhone = new ITelephone(123456);' because:
        // we have to find an interface but the actual class implementation in this case deskphone is the specific
        // functionality for a certain type of telephone. So the interface is there at an abstract level to tell you
        // what methods are valid and have to be actually overridden in an actual class. So that's why you can't
        // actually instantiate it using the Itelephone interface
        ITelephone timsPhone;
        timsPhone = new DeskPhone(123456);
        timsPhone.powerOn();
        timsPhone.callPhone(123456);
        timsPhone.answer();

        // code output:
        // No action taken, desk phone does not have a power button
        // Ring ring
        // Answering the desk phone
    }
}
