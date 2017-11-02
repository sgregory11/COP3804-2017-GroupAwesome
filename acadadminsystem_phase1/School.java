package acadadminsystem_phase1;

import java.util.*;

/**
 *
 * @author Mayelin
 */
public class School
{
    // instance variables
    private String schoolName;
    private ArrayList<Student> listOfStudents = new ArrayList<>();
    private ArrayList<Instructor> listOfInstructors = new ArrayList<>();
    private ArrayList<Course> listOfCourses = new ArrayList<>();
    
    /**
     * This constructor initializes the fields to the passed values.
     * @param name The school name.
     * @param students The list of students attending the school.
     * @param instructors The list of instructors teaching at the school.
     * @param courses The list of courses taught at the school.
     */
    public School(String name, ArrayList<Student> students, ArrayList<Instructor> instructors, ArrayList<Course> courses)
    {
        schoolName = name;
        listOfStudents = students;
        listOfInstructors = instructors;
        listOfCourses = courses;
    }
    
    /**
     * The getSchoolName method returns the school name.
     * @return School name.
     */
    public String getSchoolName()
    {
        return schoolName;
    }
    
    /**
     * The getListOfStudents method returns the list of students attending the school.
     * @return list of students attending the school.
     */
    public ArrayList<Student> getListOfStudents()
    {
        return listOfStudents;
    }
    
    /**
     * The getListOfInstructors method returns the list of instructors teaching at the school.
     * @return list of instructors teaching at the school.
     */
    public ArrayList<Instructor> getListOfInstructors()
    {
        return listOfInstructors;
    }
    
    /**
     * The getListOfCourses method returns the list of courses taught at the school.
     * @return list of courses taught at the school.
     */
    public ArrayList<Course> getListOfCourses()
    {
        return listOfCourses;
    }
    
    /**
     * The setSchoolName method stores a value in the name field.
     * @param name the new school name.
     */
    public void setSchoolName(String name)
    {
        schoolName = name;
    }
    
    /**
     * The setListOfStudents method stores a value in the listOfStudents field.
     * @param students the list of students to store in the listOfStudents field.
     */
    public void setListOfStudents(ArrayList<Student> students)
    {
        listOfStudents = students;
    }
    
    /**
     * The setListOfInstructors method stores a value in the listOfInstructors field.
     * @param instructors the list of instructors to store in the listOfInstructors field.
     */
    public void setListOfInstructors(ArrayList<Instructor> instructors)
    {
        listOfInstructors = instructors;
    }
    
    /**
     * The setListOfCourses method stores a value in the listOfCourses field.
     * @param courses the list of courses to store in the listOfCourses field.
     */
    public void setListOfCourses(ArrayList<Course> courses)
    {
        listOfCourses = courses;
    }
    
    /**
     * The toString method returns a string representing the state of a School object.
     * @return A string containing the school's information: school name, list of students, list of 
     * instructors, and list of courses.
     */ 
    @Override
    public String toString()
    {
        String output = String.format("\n%-30s %s", 
                             "School Name:", schoolName);
        
        output  += "\n\n***********************************************************\n"
                +  "*                      List of Students                   *\n"
                +  "***********************************************************\n";
        
        if( listOfStudents == null || listOfStudents.isEmpty() )
            output += "There are no students.";
        else
        {
            for( Student studentElement : listOfStudents)
                output  += studentElement
                        + "\n========================================================\n";
        }
        
        output  += "\n\n***********************************************************\n"
                +  "*                    List of Instructors                  *\n"
                +  "***********************************************************\n";
          
        if( listOfInstructors == null || listOfInstructors.isEmpty() )
            output += "There are no instructors.";
        else
        {
            for( Instructor instructorElement : listOfInstructors )
                output += "\n" + instructorElement
                       + "\n-------------------------------------------------------";
        }
        
        output  += "\n\n***********************************************************\n"
                +  "*                      List of Courses                    *\n"
                +  "***********************************************************\n";
          
        if( listOfCourses == null || listOfCourses.isEmpty() )
            output += "There are no courses.";
        else
        {
            for( Course courseElement : listOfCourses )
                output += "\n" + courseElement;
        }
        
        return output;
    }
    
    
}
