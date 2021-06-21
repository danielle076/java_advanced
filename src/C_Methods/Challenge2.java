package C_Methods;

public class Challenge2 {
    public static void main(String[] args) {
        System.out.println(isDivisible(12, 3));
        System.out.println(isDivisible(15, 5));
        System.out.println(isDivisible(13, 3));
        System.out.println(isDivisible(14, 3));
        System.out.println(isDivisible(14, 4));
    }

    private static String isDivisible(int number, int divisible) {
        if (number % divisible == 0) {
            return number + " is divisible by " + divisible;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("The number ").append(number).append(" is not divisible by: ").append(divisible)
                .append(".\r\n");

        int restNumber = number % divisible;
        double deling = (double) restNumber / divisible;

        if (deling < 0.50) {
            stringBuilder.append("Decrease the number by ").append(restNumber);
        } else {
            stringBuilder.append("Increase the number by ").append(divisible - restNumber);
        }
        return stringBuilder.toString();
    }
}
