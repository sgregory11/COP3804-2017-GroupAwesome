/*
Programmer: Jorge Armas
Group Member: 4
Project: Implementation of the TransientStudent and School classes.

 */
package acadadminsystem_phase1;

import java.util.ArrayList;

/**
 * This class represents the school that is using this system to maintain their
 * information. It includes a list of students, instructors, and courses
 * offered.
 *
 * @author Jorge armas
 */
public class School {

    // instance variables
    private String schoolName;
    private ArrayList<Student> listOfStudents;
    private ArrayList<Instructor> listOfInstructors;
    private ArrayList<Course> listOfCourses;

    /**
     * This constructor initializes the field to the passed value.
     *
     * @param school
     * @param students
     * @param instructors
     * @param courses
     */
    public School(String school, ArrayList<Student> students, ArrayList<Instructor> instructors, ArrayList<Course> courses) {
        schoolName = school;
        listOfStudents = students;
        listOfInstructors = instructors;
        listOfCourses = courses;

    }

    /**
     * The getschoolName method returns a school object's name.
     *
     * @return The value in the name field.
     */
    public String getschoolName() {
        return schoolName;
    }

    /**
     * The getlistOfStudents method returns an ArrayList of students
     *
     * @return The value in the name field.
     */
    public ArrayList<Student> getlistOfStudents() {
        return listOfStudents;
    }

    /**
     * The getlistOfInstructors method returns an ArrayList of Instructors
     *
     * @return The value in the name field.
     */
    public ArrayList<Instructor> getlistOfInstructors() {
        return listOfInstructors;
    }

    /**
     * The getlistOfCourses method returns an ArrayList of courses
     *
     * @return The value in the name field.
     */
    public ArrayList<Course> getlistOfCourses() {
        return listOfCourses;
    }

    /**
     * The setschoolName method stores a value in the schoolName field.
     *
     * @param schoolName the value to store in school.
     */
    public void setschoolName(String school) {
        schoolName = school;
    }

    /**
     * The setlistOfStudents method stores an ArrayList of students in the
     * listOfStudents field.
     *
     * @param students
     */
    public void setlistOfstudents(ArrayList<Student> students) {
        listOfStudents = students;
    }

    /**
     * The setlistOfInstructors method stores an ArrayList of Instructor in the
     * listOfInstructorss field.
     *
     * @param instructors
     */
    public void setlistOfInstructors(ArrayList<Instructor> instructors) {
        listOfInstructors = instructors;
    }

    /**
     * The setlistOfCourses method stores an ArrayList of courses in the
     * listOfCourses field.
     *
     * @param courses
     */
    public void setlistOfCourses(ArrayList<Course> courses) {
        listOfCourses = courses;
    }

    /**
     * The toString method returns a string representing the state of the
     * object.
     *
     * @return
     */
    @Override
    public String toString() {
        // Create a string representing the object.
        
        String str1 = "";
        String str = "School Name:                   " + schoolName + "\n";
        System.out.print(str);
        
        getlistOfStudents();
        
        if (listOfStudents != null) {
            str1 = "";
            return str1+= ("\n***********************************************************\n" +
                       "*                      List of Students                   *\n" +
                       "***********************************************************\n") +
                    getlistOfStudents();
        } else if (listOfStudents == null)
           return str1 = ("\n***********************************************************\n" +
                       "*                      List of Students                   *\n" +
                       "***********************************************************\n"
                   + "\nThere are no students");
        getlistOfInstructors();
        
        if (listOfInstructors != null) {
            str = "";
            return str1+= ("\n***********************************************************\n" +
                       "*                      List of Instructors                   *\n" +
                       "***********************************************************\n") +
                    getlistOfInstructors();
        } else if (listOfInstructors == null)
           return str1 = ("\n***********************************************************\n" +
                       "*                      List of Instructors                    *\n" +
                       "***********************************************************\n"
                   + "\nThere are no Intructors");
        
        getlistOfStudents();
        
        if (listOfCourses != null) {
            str1 = "";
            return str1+= ("\n***********************************************************\n" +
                       "*                      List of Courses                        *\n" +
                       "***********************************************************\n") +
                    getlistOfStudents();
        } else if (listOfCourses == null)
           return str1 = ("\n***********************************************************\n" +
                       "*                      List of Courses                     *\n" +
                       "***********************************************************\n"
                   + "\nThere are no courses");
        
        // Return the string.
        return str;

    }

}
