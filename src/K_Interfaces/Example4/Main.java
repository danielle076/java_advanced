package K_Interfaces.Example4;

public class Main {

    public static void main(String[] args) {
        ITelephone timsPhone;
        timsPhone = new MobilePhone(24565);
        timsPhone.powerOn(); // Mobile phone not on or number different when this is not written
        timsPhone.callPhone(24565);
        timsPhone.answer();
    }
}
