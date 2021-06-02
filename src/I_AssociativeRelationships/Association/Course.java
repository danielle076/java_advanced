package nl.novi.opdracht2;

public class Course {
    public String courseName;
    public int courseNo;

    public String getCourseInfor(){
        return courseName + " (" + courseNo + ") ";
    }
}
