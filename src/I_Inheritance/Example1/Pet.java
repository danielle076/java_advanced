package I_Inheritance.Example1;

class Pet {
    protected String type;
    protected String name;

    public Pet(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public String food() {
        return "Nom nom";
    }
}
