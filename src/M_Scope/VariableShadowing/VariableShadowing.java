package M_Scope.VariableShadowing;

public class VariableShadowing {
    String name = "Krishna";
    int age = 25;

    public void display() {
        String name = "Vishnu";
        int age = 22;
        System.out.println("Name: " + name);
        System.out.println("age: " + age);
//        System.out.println("Name: "+this.name);
//        System.out.println("age: "+this.age);
    }

    public static void main(String args[]) {
        new VariableShadowing().display();
    }
}

