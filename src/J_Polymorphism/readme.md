## J_Polymorphism

J_Polymorphism means <i>many forms</i>>, and it occurs when we have many classes that are related to each other by inheritance.

Inheritance lets us inherit attributes and methods from another class. J_Polymorphism uses those methods to perform different tasks. This allows us to perform a single action in different ways.

For example, think of a superclass called `Animal` that has a method called `animalSound()`. Subclasses of Animals could be `Pigs`, `Dogs` - And they also have their own implementation of an animal sound (the pig oinks, and the cat barks, etc.):

    class Animal {
        public void animalSound() {
            System.out.println("The animal makes a sound");
        }
    }
    
    class Pig extends Animal {
        public void animalSound() {
            System.out.println("The pig says: wee wee");
        }
    }
    
    class Dog extends Animal {
        public void animalSound() {
            System.out.println("The dog says: bow wow");
        }
    }

Now we can create `Pig` and `Dog` objects and call the `animalSound()` method on both of them.

    class Main {
        public static void main(String[] args) {
            Animal myAnimal = new Animal();  
            Animal myPig = new Pig();  
            Animal myDog = new Dog();  

            myAnimal.animalSound();
            myPig.animalSound();
            myDog.animalSound();
        }
    }

When creating the objects you see that 3 times the word `Animal` is used, since you are working with subclasses you can create a `Pig` and `Dog` object with the name of the superclass.

![img.png](img.png)