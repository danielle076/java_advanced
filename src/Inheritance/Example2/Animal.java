package Inheritance.Example2;

public class Animal {
    // step 1: fields/states all animals have
    private String name;
    private int brain;
    private int body;
    private int size;
    private int weight;

    // step 2: constructor
    public Animal(String name, int brain, int body, int size, int weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    // step 10: adding behaviors, methods, that animals do
    public void eat() {
        System.out.println("Animal.eat() called");
    }

    // step 14: new method. (int speed) means how fast the animal is
    public void move(int speed) {
        System.out.println("Animal.move() called. Animal is moving at " + speed);
    }

    // step 3: getters
    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }
}
