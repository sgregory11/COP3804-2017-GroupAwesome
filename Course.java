package acadadminsystem_phase1;

/**
 * This class represents a course offered by the school.
 * @author David Santana
 */
public class Course implements Comparable<Course>
{
    // instance variables
    private String courseNumber;
    private int numberOfCredits;
    private Instructor instructor;
    
    /**
     * This constructor initializes the fields to the passed values.
     * @param crsNumber The course number.
     * @param credits The number of credits for the course.
     * @param instr Instructor teaching the course.
     */
    public Course(String crsNumber, int credits, Instructor instr)
    {
        courseNumber = crsNumber;
        // if the credits parameter is negative, throw an exception.
        if( credits >= 0 )
            numberOfCredits = credits;
        else
            throw new IllegalArgumentException("The number of credits for a course cannot be negative.");
        instructor = instr;
    }
    
    /**
     * This is a copy constructor. It initializes the fields of the object being created to the same
     * values as the fields in the object passed as an argument.
     * @param courseObject The object being copied.
     */
    public Course(Course courseObject)
    {
        if( courseObject != null )
        {
            courseNumber = new String (courseObject.courseNumber);
            numberOfCredits = courseObject.numberOfCredits;
            instructor = new Instructor(courseObject.instructor);
        }
    }
    
    /**
     * The getCourseNumber method returns a Course's number.
     * @return The value in the courseNumber field.
     */
    public String getCourseNumber()
    {
        return courseNumber;
    }
    
    /**
     * The getNumberOfCredits method returns a Course's number of credits.
     * @return The value in the numberOfCredits field.
     */
    public int getNumberOfCredits()
    {
        return numberOfCredits;
    }
    
    /**
     * The getInstructor method returns a Course's instructor.
     * @return The value in the instructor field.
     */
    public Instructor getInstructor()
    {
        return instructor;
    }
    
    /**
     * The setCourseNumber method stores a value in the courseNumber field.
     * @param crsNumber the value to store in courseNumber.
     */
    public void setCourseNumber(String crsNumber)
    {
        courseNumber = new String(crsNumber);
    }
    
    /**
     * The setNumberOfCredits method stores a value in the numberOfCredits field.
     * @param credits the value to store in numberOfCredits.
     */
    public void setNumberOfCredits(int credits)
    {
        numberOfCredits = credits;        
    }
    
    /**
     * The setInstructor method stores a value in the instructor field.
     * @param instr the value to store in instructor.
     */ 
    public void setInstructor(Instructor instr)
    {
        instructor = new Instructor(instr);
    }
    
    
    /**
     * The toString method returns a string representing the state of a Course object.
     * @return A string containing the course information: course number, number of credits, and
     * instructor teaching the course.
     */  
    @Override
    public String toString()
    {
        return String.format("\n%-30s %s \n%-30s %s \n%-30s \n%s %s \n%s", 
                             "Course Number:", courseNumber,
                             "Number of Credits:", numberOfCredits,
                             "Instructor Information", 
                             "-------------------------------------------------------",
                             instructor,
                             "-------------------------------------------------------");
    }
    
    /**
     * The equals method compares two Course objects. The result is true if the argument 
     * is not null and is a Course object with the same courseNumber as the calling object.
     * @param obj The object to compare this Course with.
     * @return true if the given object has the same value for the courseNumber field.
     */
    @Override
    public boolean equals(Object obj) 
    {
        // check that the type of the parameter is Course
        if( !(obj instanceof Course) )
            return false;
        
        // we already know that obj is of type Course, so it's safe to cast
        Course courseObject = (Course) obj;
        
        // return true or false depending on whether courseNumber has the same value
        return courseObject.courseNumber.equals(this.courseNumber);     
    }

    @Override
    public int compareTo(Course o) {
        if (o.getCourseNumber().equals(this.courseNumber))
            return 0;

        else{
            int temp = Integer.parseInt(o.courseNumber);
            int temp2 = Integer.parseInt(this.courseNumber);

            if (temp > temp2){
                return 1;
            } else {
                return -1;
            }
        }
    }
}
