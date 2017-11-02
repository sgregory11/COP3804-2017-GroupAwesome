package acadadminsystem_phase1;/*
Programmer: Jorge Armas
Group Member: 4
Project: Implementation of the acadadminsystem_phase1.TransientStudent and acadadminsystem_phase1.School classes.

 */


import java.util.ArrayList;

/**
 *This class represents the school that is using this system to maintain their information.  It includes a list of students, instructors, and courses offered.
 * @author Jorge armas
 */

public class School 
{
    // instance variables
    private String schoolName;
    private ArrayList<Student> listOfStudents;
    private ArrayList<Instructor> listOfInstructors;
    private ArrayList<Course> listOfCourses;
    
    //Constructor
    public School(String school, ArrayList<Student> students, ArrayList<Instructor> instructors, ArrayList<Course> courses)
    {
       schoolName = school;
       listOfStudents = students;
       listOfInstructors = instructors;
       listOfCourses = courses;    
    
    }  
    
     
        //Get method that will return a string
         public String getschoolName()
        {
            return schoolName;
        }
         
         //Get method that will return an ArrayList of Students         
         public ArrayList<Student> getlistOfStudents()
        {
            return listOfStudents;
        }
         
         //Get method that will return an ArrayList of Instructors 
         public ArrayList<Instructor> getlistOfInstructors()
        {
            return listOfInstructors;
        } 
         
         //Get method that will return an ArrayList of Courses 
         public ArrayList<Course> getlistOfCourses()
        {
            return listOfCourses;
        }
         
         //The setschoolName method stores a value in the schoolName field.
         public void setschoolName(String school)
        {
            schoolName = school;
        }
          
         //The setlistOfstudents method stores an ArrayList value in the listOfStudents field.
          public void setlistOfstudents(ArrayList<Student> students)
        {
            listOfStudents = students;
        } 
          
         //The setlistOfInstructors method stores an ArrayList value in the listOfInstructors field. 
         public void setlistOfInstructors(ArrayList<Instructor> instructors)
        {
            listOfInstructors = instructors;
        }
         
         //The setlistOfCourses method stores an ArrayList value in the listOfCourses field. 
         public void setlistOfCourses(ArrayList<Course> courses)
        {
            listOfCourses = courses;
        }
         
         //The toString method returns a string representing the state of a acadadminsystem_phase1.School object.
           public String toString()
        {
        // Create a string representing the object.
        String str =    String.format("\n%-20s %s", "acadadminsystem_phase1.School Name:", schoolName);
                       // String.format("\n%-20s %s", "List of Students:", listOfStudents) +
                       // String.format("\n%-20s %s", "List Of Instructors:", listOfInstructors)+
                       // String.format("\n%-20s %s", "List Of Courses:", listOfCourses);
        
        
        if (listOfStudents !=null)
        {
            // String studentInfo = "";
            for(Student studentElement : listOfStudents)
                str += studentElement + "\n";
        }
        else
            str += "There is no student";
        str += String.format("\n%s \n %s", "Students:" , str);
        
        
         if (listOfInstructors !=null)
        {
            // String studentInfo = "";
            for(Instructor instructorElement : listOfInstructors)
                str += instructorElement + "\n";
        }
        else
            str += "There is no Instructors ";
        str += String.format("\n%s \n %s", "Instructors:" , str);
        
        
         if (listOfCourses !=null)
        {
            // String studentInfo = "";
            for(Course courseElement : listOfCourses)
                str += courseElement + "\n";
        }
        else
            str += "There is no courses ";
        str += String.format("\n%s \n %s", "Courses:" , str);

        // Return the string.
        return str;

        }
              
    }
    

