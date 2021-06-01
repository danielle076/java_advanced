## Class and Objects

In Java, we use objects and classes to organize data.

- An object has a state and a behavior
- An object stores its state in fields, the variables
- They expose their behavior with methods
- To create an object, you must first have a class. A class provides a description of the objects you can create from it
- An object is an instance of a class  
- Class is a template or blueprint for creating objects
- The computer creates individual objects of the class during the execution of our program
- Always place a class in its OWN file with the same name
- When creating classes it is recommended to start the name with a Captital
- Classes allow us to create variables that can be seen and are accessible from anywhere within the class that we're creating. These are called class or member variables but most commonly refer to them as fields.

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

With `loop1.returnData();` it does nothing, you have to use `System.out.println()`.

    package H_ClassAndObjects;
    
    public class Main {
    
        public static void main(String[] args) {
            Loop loop1 = new Loop();
            System.out.println(loop1.returnData());
        }
    }

It's better to put `System.out.println()` in the Class, so as follows.

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

It is also possible to have a `parameter`, to which we can pass `data`.

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

### Example class Car

`public class Car` means: the statement to create a new class with the name Car.

Access modifiers:
1. `Public`: it can be accessed from within the class, outside the class, within the package and outside the package
2. `Private`: access level of a private modifier is only within the class. It cannot be accessed from outside the class
3. `Protected`: access level is within the package and outside the package through child class. If you do not make the child class, it cannot be accessed from outside the package
4. `Default`: access level is only within the package. It cannot be accessed from outside the package. If you do not specify any access level, it will be the default

<i>Step 1 Car.java:</i> creating a field for a class. General rule, when you're defining fields in Java in a class, you go with the access modifier private. These variables are the state component for a Car. We are trying to create a template of the variables that would be part and parcel of a Car.

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

<i>Step 2 Main.java:</i> create an object from this class, the class is just the template, which will sort of take that blueprint, that definition that we've defined in the class and create an object that we can start using. We will do this in the Main class

`Car` is a class but we can treat it as a data type. `porsche` is the name of the object. When creating a new Class you need to initialize it by `= new Car();`

    Car porsche = new Car();

<i>Step 3 Car.java:</i> making methods so that the fields or state variables are accessible for the main class: setters and getters.

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

<i>Step 4 Main.java:</i> calling the set model method for our object and updating it with the value Carrera

    porsche.setModel("Carrera");
    System.out.println("Model is " + porsche.getModel());

<i>Compleet Car.java code</i>

    package H_ClassAndObjects;
    
    public class Car {       
        private int doors;
        private int wheels;
        private String model;
        private String engine;
        private String color;

        public void setModel(String model) {
            this.model = model;
        }
    
        public String getModel() {
            return model;
        }
    }

<i>Compleet Main.java code</i>

    package H_ClassAndObjects;
    
    public class Main {
    
        public static void main(String[] args) {
            Car porsche = new Car();
    
            porsche.setModel("Carrera");
            System.out.println("Model is " + porsche.getModel());
        }
    }