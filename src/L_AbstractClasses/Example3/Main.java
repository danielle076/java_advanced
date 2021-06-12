package L_AbstractClasses.Example3;

public class Main {

    public static void main(String[] args) {
        // abstraction is when you define the required functionality for something without actually implementing the
        // data house. In other words, we're focusing on what needs to be done, not on the how it's to be done

        // abstract classes, these are classes that define methods, but do not provide an implementation of those
        // methods. The implementation itself is left to the classes that inherit from the abstract class. This is
        // different from inheriting from an interface
        // step 9: create an instance
        Dog dog = new Dog("Yorkie");
        dog.breathe();
        dog.eat();

        // step 17: create an instance
        Parrot parrot = new Parrot("Australian ringneck");
        parrot.breathe();
        parrot.eat();
        parrot.fly();

        // step 21: create an instance
        Penguin penguin = new Penguin("Emperor");
        penguin.fly();
    }
}
