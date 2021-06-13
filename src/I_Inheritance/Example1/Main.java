package I_Inheritance.Example1;

public class Main {
    public static void main(String[] args) {
        Pet aPet = new Pet("Cat", "Freckle");
        Rabbit aRabbit = new Rabbit("Bugs Bunny", "Grey");

        System.out.println("Pet food: " + aPet.food());
        System.out.println("Rabbit food: " + aRabbit.food());

        System.out.println("Pet name: " + aPet.name);
        System.out.println("Rabbit name: " + aRabbit.name);

        System.out.println("Pet type: " + aPet.type);
        System.out.println("Rabbit type: " + aRabbit.type);
    }
}