package Interfaces.Interfaces2;

public class Main {

    public static void main(String[] args) {
        // step 5: create an instance
        ITelephone timsPhone;
        timsPhone = new MobilePhone(24565);
        timsPhone.powerOn(); // Mobile phone not on or number different when this is not written
        timsPhone.callPhone(24565);
        timsPhone.answer();

        // code output:
        // Mobile phone powered up
        // Melody ring
        // Answering the mobile phone
    }
}
