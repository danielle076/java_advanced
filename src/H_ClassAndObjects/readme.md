## Class and Objects

In Java, we use objects and classes to organize data.

- To create an object, you must first have a class. A class provides a description of the objects you can create from it
- An object is an instance of a class  
- We write code and define a class in this way;
- The computer creates individual objects of the class during the execution of our program
- Always place a class in its OWN file with the same name
- A class name always starts with a capital letter

### Example class Loop

<i>Loop.java</i>

    package H_ClassAndObjects;
    
    public class Loop {
    
        public void loopCharacters(){
            for(int i = -128; i < 127; i++) {
                char ch = (char) i;
                System.out.println("Karakter op positie: " + i + " is " + ch);
            }
        }
    }

<i>Main.java</i>

With `Loop loop1 = new Loop();` you create a new object.

    package H_ClassAndObjects;
    
    public class Main {
    
        public static void main(String[] args) {
            Loop loop1 = new Loop();
            loop1.loopCharacters();
        }
    }

This is a `void` and returns no data. 

<i>Loop.java</i>

    package H_ClassAndObjects;
    
    public class Loop {
    
        public String returnData(){
            return "Dit is een test! ";
        }
    }

<i>Main.java</i>

Met `loop1.returnData();` doet hij niets, je moet `System.out.println()` gebruiken

    package H_ClassAndObjects;
    
    public class Main {
    
        public static void main(String[] args) {
            Loop loop1 = new Loop();
            System.out.println(loop1.returnData());
        }
    }

Better to put `System.out.println()` in the Class, so as follows.

<i>Loop.java</i>

    package H_ClassAndObjects;
    
    public class Loop {
    
        public String returnData(){
            return "Dit is een test! ";
        }
        
        public void printData(){
            System.out.println(returnData());
        }
    }

<i>Main.java</i>

    package H_ClassAndObjects;
    
    public class Main {
    
        public static void main(String[] args) {
            Loop loop1 = new Loop();
            loop1.printData();
        }
    }

Het is ook mogelijk om een `parameter` te hebben, waar we `data` aan mee kunnen geven.

<i>Loop.java</i>

    package H_ClassAndObjects;
    
    public class Loop {
        public String returnData(String data){
            return data;
        }
    
        public void printData(String data){
            System.out.println(returnData(data));
        }
    }

<i>Main.java</i>

    package H_ClassAndObjects;
    
    public class Main {
    
        public static void main(String[] args) {
            Loop loop1 = new Loop();
            loop1.printData("Dit is een tweede test");
        }
    }