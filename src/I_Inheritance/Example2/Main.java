package I_Inheritance.Example2;

public class Main {

    public static void main(String[] args) {
        // step 8: creating a new Animal object
        Animal animal = new Animal("Animal", 1, 1, 5, 5);

        // step 9: creating a new Dog object
        Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "long silky");

        // step 11: this method comes from animal and is publicly accessible by dog
        dog.eat();
        dog.walk();
        dog.run();
    }
}
