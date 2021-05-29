package D_Switch;

public class MainAssignment {

    public static void main(String[] args) {
        char switchChar = 'C';

        switch (switchChar) {
            case 'A':
                System.out.println("Letter was A");
                break;
            case 'B':
                System.out.println("Letter was B");
                break;
            case 'C':
            case 'D':
            case 'E':
                System.out.println(switchChar + " was found");
                break;
            default:
                System.out.println("Was not A, B, C, D or E");
                break;
        }
    }
}

