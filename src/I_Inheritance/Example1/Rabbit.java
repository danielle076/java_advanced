package I_Inheritance.Example1;

class Rabbit extends Pet {
    private String color;

    public Rabbit(String name, String color) {
        super("Rabbit", name);
        this.color = color;
    }

    @Override
    public String food() {
        return "Rabbit rabbit rabbit";
    }
}
