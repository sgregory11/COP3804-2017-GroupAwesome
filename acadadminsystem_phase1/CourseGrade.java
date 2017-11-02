package acadadminsystem_phase1;

/**
 * This class represents a course that a student has taken and for which he/she has received a 
 * grade.
 * @author Mayelin Felipe
 */
public class CourseGrade
{
    // instance variables
    private Course courseTaken;
    private String letterGrade;
    
    /**
     * This constructor initializes the fields to the passed values.
     * @param course Course number.
     * @param grade Grade received.
     */
    public CourseGrade(Course course, String grade)
    {
        courseTaken = course;
        letterGrade = grade;
    }
    
    /**
     * This is a copy constructor. It initializes the fields of the object being created to the same
     * values as the fields in the object passed as an argument.
     * @param courseGradeObj The object being copied.
     */
    public CourseGrade(CourseGrade courseGradeObj)
    {
        if( courseGradeObj != null )
        {
            courseTaken = courseGradeObj.courseTaken;
            letterGrade = courseGradeObj.letterGrade;
        }
    }
    
    /**
     * The getCourseTaken method returns the course that the student has taken.
     * @return A copy of the course object.
     */
    public Course getCourseTaken()
    {
        return courseTaken;
    }
    
    /**
     * The getLetterGrade method returns the grade received for a course.
     * @return The value in the letterGrade field.
     */
    public String getLetterGrade()
    {
        return letterGrade;
    }
    
    /**
     * The setCourseTaken method stores a value in the courseTaken field.
     * @param course the new Course object to store in courseTaken.
     */ 
    public void setCourseTaken(Course course)
    {
        courseTaken = course;
    }
    
    /**
     * The setLetterGrade method stores a value in the letterGrade field.
     * @param grade the value to store in letterGrade.
     */
    public void setLetterGrade(String grade)
    {
        letterGrade = grade;
    }
     
    /**
     * The toString method returns a string representing the state of a CourseGrade object.
     * @return A string containing the information for the course that has been taken: course info, 
     * and grade received.
     */  
    @Override
    public String toString()
    {
        return String.format("%s \n%-30s %s", 
                             courseTaken,
                             "Grade Received:", letterGrade);
    }
    
    /**
     * The equals method compares two CourseGrade objects. The result is true if the argument 
     * is not null and is a CourseGrade object with the same course and grade as the calling 
     * object.
     * @param obj The object to compare this CourseGrade with.
     * @return true if the given object has the same value for the courseTaken and letterGrade 
     * fields.
     */
    @Override
    public boolean equals(Object obj) 
    {
        // check that the type of the parameter is CourseGrade
        if( !(obj instanceof CourseGrade) )
            return false;
        
        // we already know that obj is of type CourseGrade, so it's safe to cast
        CourseGrade courseGradeObj = (CourseGrade) obj;
        
        // return true or false depending on whether courseTaken and letterGrade have the same value
        return courseGradeObj.courseTaken.equals(this.courseTaken) 
               && courseGradeObj.letterGrade.equals(this.letterGrade);     
    }
 
}
