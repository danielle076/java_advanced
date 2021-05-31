## Class and Objects

In Java, we use objects and classes to organize data.

- To create an object, you must first have a class. A class provides a description of the objects you can create from it
- An object is an instance of a class  
- We write code and define a class in this way;
- The computer creates individual objects of the class during the execution of our program
- Always place a class in its OWN file with the same name
- A class name always starts with a capital letter

### Example class Person

    public class Person {
        public String firstName;
        public String lastName;
    } 

> Important: when you create a Person class, your file must be named Person.java.

Two properties (attributes, variables) of type String:
- firstName
- lastName

Added method getFullName():

    package H_ClassAndObjects;
    
    import java.util.*;
    
    public class Person {
        public String firstName;
        public String lastName;
        public Calendar birthday;
        
        public String getFullName() {
           return firstName + "" + lastName;
        }
    }