package Switch;

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

        // when you want to test 10 values you should use switch
        // with a switch, a variable can be tested for equality against a list of values. Each value is called a case
        // and the switched variable is checked for each case
        // when you reach a break keyword, it breaks out of the switch. This will stop the execution of more code and
        // case testing within the block
        // default means at any other case that's not been covered above, this is what I want you to do
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

// you can use both if and switch statement, you'll get the same outcome
// switch is good to use if you're actually testing the same variable. You want to test different values for that variable