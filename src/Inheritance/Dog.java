package Inheritance;

    // step 4: if you want to inherit from another class, (you want to be able to access), you use the extends keyword
public class Dog extends Animal {
    // step 6: assign extra states/fields that dogs have
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    // step 5: make a constructor for the dog class that calls that other class
    // public Dog(String name, int brain, int body, int size, int weight) { super(name, brain, body, size, weight);
    // super: is to call the constructor that is for the class that we're extending from, in this case the superclass
    // step 7: initialize the dog fields in the constructor
    // deleting parameters, and put 1 is saying: all dogs have a brain/body
    // type de dog parameters into the constructor + initialize the fields by doing this
    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    // step 12: a dog does not eat, but chew, so an unique private method
    private void chew() {
        System.out.println("Dog.chew() called");
    }

    // step 13: use the override method to create a version of that same method that exists in the Animal class, but
    // make it unique for the Dog class
    @Override //created by Java
    public void eat() { //created by Java
        System.out.println("Dog.eat() called");
        chew();
        super.eat(); //created by Java
    }

    // step 15: use method 'move' from Animal. How does a dog move? Walk and run
    public void walk() {
        System.out.println("Dog.walk() called");
        super.move(5);
    }

    public void run() {
        System.out.println("Dog.run() called");
        super.move(10);
    }
}
