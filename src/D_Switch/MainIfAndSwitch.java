package D_Switch;

public class MainIfAndSwitch {

    public static void main(String[] args) {
        // if statement
        int value = 1; // here you fill in the value, e.g. 1, 2 or 3

        if (value == 1) {
            System.out.println("Value was 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        } else { // else is always the default, if nothing else is possible
            System.out.println("Was not 1 or 2");
        }

        // switch statement
        int valueSwitch = 3;

        switch (valueSwitch) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            default:
                System.out.println("Was not 1 or 2");
                break;
        }
    }
}