package B_AssociativeRelationships.Association;

public class Course {
    public String courseName;
    public int courseNo;

    public String getCourseInfor(){
        return courseName + " (" + courseNo + ") ";
    }
}
