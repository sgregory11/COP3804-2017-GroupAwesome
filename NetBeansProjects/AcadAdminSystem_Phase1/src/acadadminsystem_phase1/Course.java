/**
 * Created by Death on 10/3/2017.
 */
package acadadminsystem_phase1;

public class Course {
    private String courseNumber;
    private int numberOfCredits;
    private Instructor instructor;

    /**
     *
     * @param cName Course Number
     * @param nCredits Number of Credits
     * @param instruct Instructor Object
     */
    public Course(String cName, int nCredits, Instructor instruct){
        courseNumber = cName;
        numberOfCredits = nCredits;
        instructor = instruct;
    }

    /**
     * Copy Constructor
     * @param course
     */
    public Course (Course course){
        courseNumber = course.getCourseNumber();
        numberOfCredits = course.getNumberOfCredits();
        instructor = course.getInstructor();
    }

    /**
     * Equals method
     * @param obj
     * @return
     */
    public boolean equals(Object obj){
        if (!(obj instanceof Course)){
            return false;
        }
        Course course = (Course) obj;
        return getCourseNumber().equals(course.getCourseNumber())
                && getNumberOfCredits() == course.getNumberOfCredits()
                && getInstructor().equals(course.getInstructor());
    }

    /**
     * Returns instance variables
     * @return
     */
    public String toString(){
        return  "Course Number: " + getCourseNumber() + "\nNumber of Credits: " + getNumberOfCredits() + "\nInstructor: " + getInstructor();
    }


    /**
     *  Getters and Setters
     */
    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }
    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }
    public void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public Instructor getInstructor() {
        return instructor;
    }
    public int getNumberOfCredits() {
        return numberOfCredits;
    }
    public String getCourseNumber() {
        return courseNumber;
    }
}