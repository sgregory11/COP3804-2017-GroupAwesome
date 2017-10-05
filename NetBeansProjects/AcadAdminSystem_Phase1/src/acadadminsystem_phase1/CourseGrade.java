package acadadminsystem_phase1;

import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David Santana
 */
class CourseGrade {
    private Course courseTaken;
    private String letterGrade;
    
    /**
     * Normal Constructor
     * @param cTaken
     * @param lGrade 
     */
    public CourseGrade(Course cTaken, String lGrade){
        courseTaken = cTaken;
        letterGrade = lGrade;
    }
    
    /**
     * Copy Constructor
     * @param cGrade 
     */
    public CourseGrade(CourseGrade cGrade){
        courseTaken = cGrade.getCourseTaken();
        letterGrade = cGrade.getLetterGrade();
    }

    /**
     * Returns instance variables
     * @return 
     */
    @Override
    public String toString() {
        return "CourseGrade{" + "courseTaken=" + courseTaken
                + ", letterGrade=" + letterGrade + '}';
    }

    /**
     * 
     * @param obj
     * @return 
     */
    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof CourseGrade)){
            return false;
        }
        
        CourseGrade cGrade = (CourseGrade) obj;
        
        return courseTaken.equals(cGrade);
    }

    /**
     * Getters and Setters
     * @return 
     */
    
    public Course getCourseTaken() {
        return courseTaken;
    }

    public String getLetterGrade() {
        return letterGrade;
    }

    public void setCourseTaken(Course courseTaken) {
        this.courseTaken = courseTaken;
    }

    public void setLetterGrade(String letterGrade) {
        this.letterGrade = letterGrade;
    }
    
    
    
    
}
