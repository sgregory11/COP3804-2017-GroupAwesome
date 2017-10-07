package acadadminsystem_phase1;

import java.util.*;

/**
 *
 * @author Mayelin
 */
public class AcadAdminSystem_Phase1 {

    public static void main(String[] args) {

        // create a School object with no students, instructors, or courses
        School mySchool = new School("Technical Institute of Miami", null, null, null);

        // display the school info
        System.out.println("#####################################################");
        System.out.println("#                  SCHOOL INFORMATION               #");
        System.out.println("#####################################################");
        System.out.println(mySchool + "\n");

        // create three Instructor objects
        Instructor instructor_1 = new Instructor("Juan", "Perez", "M-W 09:00 to 11:00 am");
        Instructor instructor_2 = new Instructor(instructor_1);
        Instructor instructor_3 = new Instructor(instructor_2);

        System.out.println("Are instructor_1 and instructor_2 referencing the same object? " + (instructor_1 == instructor_2));
        System.out.println("Do they have the same data? " + instructor_1.equals(instructor_2));

        instructor_2.setFirstName("William");
        instructor_2.setLastName("White");
        instructor_2.setOfficeHours("M-W 03:00 to 06:00 pm");

        instructor_3.setFirstName("Dorothy");
        instructor_3.setLastName("Duran");
        instructor_3.setOfficeHours("T-Th 02:00 to 04:00 pm");

        // display information for all instructors
        System.out.println("#####################################################");
        System.out.println("#                     INSTRUCTORS                   #");
        System.out.println("#####################################################");
        System.out.println(instructor_1 + "\n");
        System.out.println(instructor_2 + "\n");
        System.out.println(instructor_3 + "\n");

        // create six Course objects
        Course course_1 = new Course("COP3804", 3, instructor_1);
        Course course_2 = new Course("MAC3211", 4, instructor_2);
        Course course_3 = new Course("CGS1920", 1, instructor_1);
        Course course_4 = new Course("COP2250", 3, instructor_3);
        Course course_5 = new Course(course_2);
        Course course_6 = new Course(course_4);

        System.out.println("Are course_2 and course_5 referencing the same object? " + (course_2 == course_5));
        System.out.println("Do they have the same course number? " + course_2.equals(course_5));

        course_5.setCourseNumber("MAD3512");
        course_5.setNumberOfCredits(3);
        course_6.setCourseNumber("COP4610");

        // display information for courses
        System.out.println("#####################################################");
        System.out.println("*                       COURSES                    *");
        System.out.println("#####################################################");
        System.out.println(course_1 + "\n");
        System.out.println(course_2 + "\n");
        System.out.println(course_3 + "\n");
        System.out.println(course_4 + "\n");
        System.out.println(course_5 + "\n");
        System.out.println(course_6 + "\n");

        // display instructor_1 and instructor_2 again
        System.out.println("#####################################################");
        System.out.println("#                     INSTRUCTORS                   #");
        System.out.println("#####################################################");
        System.out.println(instructor_1 + "\n");
        System.out.println(instructor_2 + "\n");

        // create six CourseGrade objects
        CourseGrade courseGrade_1 = new CourseGrade(course_1, "A");
        CourseGrade courseGrade_2 = new CourseGrade(course_2, "B");
        CourseGrade courseGrade_3 = new CourseGrade(course_3, "C");
        CourseGrade courseGrade_4 = new CourseGrade(course_4, "A");
        CourseGrade courseGrade_5 = new CourseGrade(courseGrade_1);
        CourseGrade courseGrade_6 = new CourseGrade(courseGrade_2);

        // change the courseTaken field inside these 2 CourseGrade
        courseGrade_5.setCourseTaken(course_5);
        courseGrade_6.setCourseTaken(course_6);

        // changes to the Course objects should not affect the data inside the CourseGrade objects
        course_5.setCourseNumber("ENC1101");
        course_6.setCourseNumber("BIO1000");

        // display information for the course grades
        System.out.println("#####################################################");
        System.out.println("#                  COURSE GRADES                    #");
        System.out.println("#####################################################");
        System.out.println(courseGrade_1 + "\n");
        System.out.println(courseGrade_2 + "\n");
        System.out.println(courseGrade_3 + "\n");
        System.out.println(courseGrade_4 + "\n");
        System.out.println(courseGrade_5 + "\n");
        System.out.println(courseGrade_6 + "\n");

        // create three ArrayLists of CourseGrade objects
        ArrayList<CourseGrade> studentGrades = new ArrayList<>();
        studentGrades.add(courseGrade_1);
        studentGrades.add(courseGrade_2);

        ArrayList<CourseGrade> dualEnrlStudentGrades = new ArrayList<>();
        dualEnrlStudentGrades.add(courseGrade_3);
        dualEnrlStudentGrades.add(courseGrade_4);

        ArrayList<CourseGrade> transientStudentGrades = new ArrayList<>();
        transientStudentGrades.add(courseGrade_5);
        transientStudentGrades.add(courseGrade_6);

        // create a Student object and display his information
        Student student = new Student("John", "Smith", 1, "08/15/2015", "Information Technology", studentGrades);
        System.out.println("#####################################################");
        System.out.println("*                STUDENT INFORMATION                *");
        System.out.println("#####################################################");
        System.out.println(student + "\n");

        // create a DualEnrolledStudent object and display his information
        DualEnrolledStudent dualEnrlStudent = new DualEnrolledStudent("Mary", "Morales",
                2, "07/22/20014", "Undecided", dualEnrlStudentGrades, "Coral Park High School", 11);
        System.out.println("#####################################################");
        System.out.println("*        DUAL ENROLLED STUDENT INFORMATION          *");
        System.out.println("#####################################################");
        System.out.println(dualEnrlStudent + "\n");

        // create a TransientStudent object and display his information
        TransientStudent transientStudent = new TransientStudent("Robert", "Brown",
                3, "08/12/2016", "Computer Science", transientStudentGrades, "Miami Dade College");
        System.out.println("#####################################################");
        System.out.println("*          TRANSIENT STUDENT INFORMATION            *");
        System.out.println("#####################################################");
        System.out.println(transientStudent + "\n");

        // create an ArrayList of Students
        ArrayList<Student> students = new ArrayList<>();
        students.add(student);
        students.add(dualEnrlStudent);
        students.add(transientStudent);

        // create an ArrayList of Instructors
        ArrayList<Instructor> instructors = new ArrayList<>();
        instructors.add(instructor_1);
        instructors.add(instructor_2);
        instructors.add(instructor_3);

        // create an ArrayList of Courses
        ArrayList<Course> courses = new ArrayList<>();
        courses.add(course_1);
        courses.add(course_2);
        courses.add(course_3);
        courses.add(course_4);
        courses.add(course_5);
        courses.add(course_6);

        // set the school's list of students
        mySchool.setlistOfstudents(students);
        //mySchool.setListOfStudents(students);

        // set the school's list of instructors
        mySchool.setlistOfInstructors(instructors);
        //mySchool.setListOfInstructors(instructors);

        // set the school's list of courses
        mySchool.setlistOfCourses(courses);
        //mySchool.setListOfCourses(courses);

        // display the school info again
        System.out.println("#####################################################");
        System.out.println("*                  SCHOOL INFORMATION               *");
        System.out.println("#####################################################");
        System.out.println(mySchool + "\n");

    }

}
