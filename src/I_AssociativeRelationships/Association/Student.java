package nl.novi.opdracht2;

public class Student {
    public String firstName;
    public String lastName;
    public Course currentCourse;

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String getStudentAndCourseInfo(){
        return getFullName() + " volgt " + currentCourse.getCourseInfor();
    }
}
