package L_AbstractClasses.Example3;

public class Main {

    public static void main(String[] args) {
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
