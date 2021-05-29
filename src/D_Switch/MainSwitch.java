package D_Switch;

public class MainSwitch {
    public static void main(String[] args) {
        // switch statement currentSeason with 4 seasons
        int currentSeason = 0;

        switch (currentSeason) {
            case 1: // ga wandelen in de natuur
                System.out.println("Lente!");
                break;
            case 2: // ga liggen op het strand
                System.out.println("Zomer!");
                break;
            case 3: // ga steden bezoeken
                System.out.println("Herfst!");
                break;
            default: // het is winter, ga op wintersport
                System.out.println("Winter!");
                break;
        }

        // what if currentSeason is 6, we only have 4 seasons: We make an if statement around the switch statement.
        // we have additional conditions: if anotherSeason is greater than or equal to 0 AND less than 5, then you may execute the switch statement
        int anotherSeason = 3;

        if (anotherSeason >= 0 && anotherSeason < 5) {
            switch (anotherSeason) {
                case 1: // ga wandelen in de natuur
                    System.out.println("Lente!");
                    break;
                case 2: // ga liggen op het strand
                    System.out.println("Zomer!");
                    break;
                case 3: // ga steden bezoeken
                    System.out.println("Herfst!");
                    break;
                default: // het is winter, ga op wintersport
                    System.out.println("Winter!");
                    break;
            }
        }

        // switch statement switchValue
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

        // switch statement toUppercase()
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