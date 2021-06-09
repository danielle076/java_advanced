## K_Interfaces

An interface is a special kind of class, which is actually not a class, you have to implement it before you can use it. When using an interface, use the word `implements`. It is possible to implement more than 1 interface.

An interface has no attributes (properties, variables), except for any constants. It is a reference type in Java, it is similar to class, it is a collection of abstract methods.

Writing an interface is similar to writing a class. But a class describes the attributes and behaviours of an object. And an interface contains behaviours that a class implements.

When another class implements an interface, the abstract methods must be overridden.

It is possible to both inherit 1 other class, and implement 1 or more interfaces. 

### Example1

Interface `Animal.java`

    interface Animal {
        public void animalSound(); 
        public void sleep(); 
    }

The interface methods `animalSound()` and `sleep()` do not have a body.

`Pig.java` "implements" the Animal interface.

    class Pig implements Animal {
        public void animalSound() {
            // The body of animalSound() is provided here
            System.out.println("The pig says: wee wee");
        }
        public void sleep() {
            // The body of sleep() is provided here
            System.out.println("Zzz");
        }
    }

    class Main {
        public static void main(String[] args) {
            Pig myPig = new Pig();  // Create a Pig object
            myPig.animalSound();
            myPig.sleep();
        }
    }

![img.png](img.png)