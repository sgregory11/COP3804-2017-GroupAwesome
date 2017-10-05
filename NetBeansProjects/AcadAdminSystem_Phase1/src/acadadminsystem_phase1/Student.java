package acadadminsystem_phase1;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author David Santana
 */
public class Student extends Person {

    private int studentID;
    private String dateOfAdmission;
    private String major;
    private ArrayList<CourseGrade> coursesTaken;

    /**
     * Normal Constructor
     *
     * @param id Student ID
     * @param dateAdd Date of Admission
     * @param maj Major
     * @param cTaken Courses Taken
     */
    public Student(String fName, String lName, int id, String dateAdd, String maj, ArrayList<CourseGrade> cTaken) {
        super(fName, lName);
        studentID = id;
        dateOfAdmission = dateAdd;
        major = maj;
        coursesTaken = cTaken;
    }

    /**
     * Copy Constructor
     *
     * @param student
     */
    public Student(Student student) {
        /*super con*/
        super(student);
        studentID = student.getStudentID();
        dateOfAdmission = student.getDateOfAdmission();
        major = student.getMajor();
        coursesTaken = student.getCoursesTaken();
    }

    /**
     * Creates string with all courses taken
     * @return 
     */
    private String allCoursesTaken() {
        String temp = "";
        for (int i = 0; i < coursesTaken.size(); i++) {
            temp += coursesTaken.get(i) + ", ";
        }
        return temp;
    }
    
    /**
     * Returns variables
     * @return 
     */
    @Override
    public String toString() {
        return "Student{" + "studentID="
                + studentID + ", dateOfAdmission=" + dateOfAdmission
                + ", major=" + major
                + ", coursesTaken=" + allCoursesTaken() + '}';
    }
    
    /**
     * Equals Method
     * @param obj
     * @return 
     */
    @Override
    public boolean equals(Object obj){
        if(!(obj instanceof Student)){
            return false;
        }
        
        Student std = (Student) obj;
        
        return getFirstName().equals(std.getFirstName())
               && getLastName().equals(std.getLastName())
               && dateOfAdmission.equals(std.getDateOfAdmission());
    }
    
    /**
     * Getters and Setters
     */
    
    public int getStudentID() {
        return studentID;
    }

    public String getDateOfAdmission() {
        return dateOfAdmission;
    }

    public String getMajor() {
        return major;
    }

    public ArrayList<CourseGrade> getCoursesTaken() {
        return coursesTaken;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public void setDateOfAdmission(String dateOfAdmission) {
        this.dateOfAdmission = dateOfAdmission;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setCoursesTaken(ArrayList<CourseGrade> coursesTaken) {
        this.coursesTaken = coursesTaken;
    }

}
