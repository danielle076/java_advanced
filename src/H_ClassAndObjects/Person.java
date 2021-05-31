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