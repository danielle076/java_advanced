## Abstract classes

Abstract to a class indicates the class cannot be instantiated (i.e., no object can be created from the class). The idea behind this is that an abstract class is extended by other classes.

Classes that inherit from an abstract class have a contract and are required to override the abstract methods from the superclass.

An abstract class permits you to make functionality that subclasses can implement or override whereas an interface only permits you to state functionality but not to implement it. A class can extend only one abstract class while a class can implement multiple interfaces.

When using an abstract class, use the word `extends`.

> An abstract class has no use, no value and no reason to live.

Een abstracte klasse is een klasse die gebruik je nooit voor een concreet object. Je moet deze klasse altijd kunnen overerven.

### Example

Abstract class

    abstract class Animal {
      public abstract void animalSound();
      public void sleep() {
        System.out.println("Zzz");
      }
    }

Abstract method `animalSound()` does not have a body. Method `sleep()` is a regular method.

Subclass (inherit from Animal).

    class Pig extends Animal {
      public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The pig says: wee wee");
      }
    }

    class Main {
      public static void main(String[] args) {
        Pig myPig = new Pig(); // Create a Pig object
        myPig.animalSound();
        myPig.sleep();
      }
    }

### Example2

_Animal.java_ <br/>
step 1: making the class abstract  <br/>
step 2: variable <br/>
step 3: constructor <br/>
step 4: method, use abstract <br/>
step 5: getter 

_Dog.java_ <br/>
step 6: Dog extends from Animal <br/>
step 7: constructor <br/>
step 8: override methods 

_Main.java_ <br/>
step 9: create an instance

_Bird.java_ <br/>
step 10: abstract class Bird extends from abstract class Animal <br/>
step 11: constructor <br/>
step 12: override methods <br/>
step 13: add abstract method fly

_Parrot.java_ <br/>
step 14: Parrot extends from Bird <br/>
step 15: constructor <br/>
step 16: override method fly

_Main.java_ <br/>
step 17: create an instance

_Penguin.java_ <br/>
step 18: Penguin extends from Bird <br/>
step 19: constructor <br/>
step 20: override method fly 

_Main.java_ <br/>
step 21: create an instance
