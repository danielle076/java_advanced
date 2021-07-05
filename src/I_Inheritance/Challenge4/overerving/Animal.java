package I_Inheritance.Challenge4.overerving;

public class Animal {

    private String name;
    public boolean isFemale;

    public void move() {
        System.out.println("Moved 0.25 meters.");
    }

    public void sound() {
        System.out.println("sound");
    }
    public void sleep() {
        System.out.println("Let's sleep for 8 hours");
    }

    public void eat(String food) {
        System.out.println("I eat " + food);
    }
}
