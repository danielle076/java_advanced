package Inheritance;

public class Main {

    public static void main(String[] args) {
        // an object oriented program allows us to do is to create classes to inherit commonly used standard behavior from
        // other classes they share common characteristics, but yet each of these devices add additional features that
        // collectively make them different to each other objects can share similar characteristics, they can also be
        // different as well

        // step 8: creating a new Animal class
        Animal animal = new Animal("Animal", 1, 1, 5, 5);

        // step 9: creating a new Dog class
        Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "long silky");
        // step 11: this method comes from animal and is publicly accessible by dog
        dog.eat();
        dog.walk();
        dog.run();
    }
}
