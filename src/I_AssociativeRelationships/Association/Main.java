package nl.novi.opdracht2;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.firstName = "Bob";
        student1.lastName = "de Student";

        Student student2 = new Student();
        student2.firstName = "Danielle";
        student2.lastName = "de Student";

        Course javaProgrammeren = new Course();
        javaProgrammeren.courseName = "Java Programmeren";
        javaProgrammeren.courseNo = 202105;
        student1.currentCourse = javaProgrammeren;
        student2.currentCourse = javaProgrammeren;

        ArrayList<Student> studenten = new ArrayList<>();
        studenten.add(student1);
        studenten.add(student2);

        for (int i = 0; i < studenten.size(); i++) {
            System.out.println(studenten.get(i).getStudentAndCourseInfo());
        }

//        System.out.println("Student: " + student1.getFullName());
//        System.out.println("Cursus: " + javaProgrammeren.getCourseInfor());
//        System.out.println(student1.getStudentAndCourseInfo());
//        System.out.println(student2.getStudentAndCourseInfo());
    }
}
