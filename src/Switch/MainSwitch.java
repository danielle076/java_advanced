package Switch;

public class MainSwitch {
    public static void main(String[] args) {
        // don't forget the break!
        int switchValue = 3;
        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Value was a 3, or a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;
            default:
                System.out.println("Was not 1, 2, 3, 4 or 5");
                break;
        }

        // with the .toLowerCase() or toUppercase() it doesn't matter how you write the word. Your case has to be
        // written with lowercase or uppercase letters.
        // this is a method that belongs to the String
        String month = "JuNE";
        switch (month.toUpperCase()) {
            case "JANUARY":
                System.out.println("January");
                break;
            case "JUNE":
                System.out.println("June");
                break;
            default:
                System.out.println("Not sure");
        }
    }
}