package acadadminsystem_phase1;

import java.util.ArrayList;

/**
 * Created by Death on 10/3/2017.
 */
public class DualEnrolledStudent extends Student {
    private String highSchoolName;
    private int highSchoolGrade;

    /**
     *
     * @param fName First Name
     * @param lName Last Name
     * @param ID    Student ID
     * @param dateOfAdd Date of Admission
     * @param maj   Major
     * @param courses   Courses Taken
     * @param hsName    High School Name
     * @param hsGrade   High School Grade
     */
    public DualEnrolledStudent(String fName, String lName, int ID, String dateOfAdd, String maj, ArrayList<CourseGrade> courses, String hsName, int hsGrade){
        super(fName, lName, ID, dateOfAdd, maj, courses);
        highSchoolName = hsName;
        highSchoolGrade = hsGrade;
    }

    /**
     * Copy Constructor
     * @param student
     */
    public DualEnrolledStudent(DualEnrolledStudent student){
        highSchoolName = student.getHighSchoolName();
        highSchoolGrade = student.getHighSchoolGrade();
    }

    /**
     * Returns Instance Variables plus Parent Variables
     * @return
     */
    public String toString(){
        return super.toString() + "High School Name: " + getHighSchoolName()
                + "\nHigh School Grade: " + getHighSchoolGrade();
    }

    /**
     * All the getters and setters
     */
    public void setHighSchoolName(String name){
        highSchoolName = name;
    }
    public void setHighSchoolGrade(int grade){
        highSchoolGrade = grade;
    }
    public String getHighSchoolName() {
        return highSchoolName;
    }
    public int getHighSchoolGrade() {
        return highSchoolGrade;
    }
}
