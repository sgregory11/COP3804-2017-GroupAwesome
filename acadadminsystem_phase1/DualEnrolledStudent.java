package acadadminsystem_phase1;

import java.util.*;

/**
 * This class represents students that are taking college credits while still attending High School.
 * @author Mayelin Felipe
 */
public class DualEnrolledStudent extends Student
{
    // instance variables
    private String highSchoolName;
    private int highSchoolGrade;
    
    /**
     * This constructor initializes the fields to the passed values.
     * @param first Student's first name.
     * @param last Student's last name.
     * @param id Student's ID.
     * @param admDate Student's admission date.
     * @param studentMajor Student's major.
     * @param courses Student's list of courses taken.
     * @param schoolName The name of the high school the student is currently attending.
     * @param schoolGrade The grade the student is currently in.
     */
    public DualEnrolledStudent( String first, String last, int id, String admDate,
                                String studentMajor, 
                                ArrayList<CourseGrade> courses, String schoolName, 
                                int schoolGrade)
    {
        super(first, last, id, admDate, studentMajor, courses);
        highSchoolName = schoolName;
        highSchoolGrade = schoolGrade; 
    }
    
    /**
     * This is a copy constructor. It initializes the fields of the object being created to the same
     * values as the fields in the object passed as an argument.
     * @param dualEnrlStdntObj The object being copied.
     */
    public DualEnrolledStudent(DualEnrolledStudent dualEnrlStdntObj)
    {
        super(dualEnrlStdntObj);
        if( dualEnrlStdntObj != null )
        {
            highSchoolName = dualEnrlStdntObj.highSchoolName;
            highSchoolGrade = dualEnrlStdntObj.highSchoolGrade;
        }
    }
    
    /**
     * The getHighSchoolName method returns a Dual Enrolled Student's high school name.
     * @return The value in the highSchoolName field.
     */
    public String getHighSchoolName()
    {
        return highSchoolName;
    }
    
    /**
     * The getHighSchoolGrade method returns a Dual Enrolled Student's high school grade.
     * @return The value in the highSchoolGrade field.
     */
    public int getHighSchoolGrade()
    {
        return highSchoolGrade;
    }
    
    /**
     * The setHighSchoolName method stores a value in the highSchoolName field.
     * @param schoolName the value to store in highSchoolName.
     */
    public void setHighSchoolName(String schoolName)
    {
        highSchoolName = schoolName;
    }
    
    /**
     * The setHighSchoolGrade method stores a value in the schoolGrade field.
     * @param schoolGrade the value to store in schoolGrade.
     */
    public void setHighSchoolGrade(int schoolGrade)
    {
        highSchoolGrade =  schoolGrade;
    }
    
    /**
     * The toString method returns a string representing the state of a DualEnrolledStudent object.
     * @return A string containing the student's information: first name, last name, id, 
     * date of admission, major, list of courses taken, high school name, and high school grade.
     */  
    @Override
    public String toString()
    {
        return super.toString() + String.format("\n\n%-30s %s \n%-30s %s", 
                                  "High School Name:", highSchoolName,
                                  "High School Grade:", highSchoolGrade);
    }
    
}
