/**
 *
 * @author Sonjay Gregory
 */
package acadadminsystem_phase1;

import java.util.Objects;

public class Instructor extends Person {
    
    private String officeHours;
    
    /**
     * 
     * @param personFirstName
     * @param personLastName
     * @param officeHours 
     */
    public Instructor(String personFirstName, String personLastName, String officeHours ) {
        super(personFirstName, personLastName);
        this.officeHours = officeHours;
    }
    
    /**
     * Copy Constructor
     * @param instructor
     * @param person
     */
    public Instructor (Instructor instructor){
        super(instructor);
            if (instructor != null){
            this.officeHours = instructor.officeHours;
        }
        
    }
    
    /**
     * Setters and Getters
     * @return 
     */

    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }
    
    /**
     * 
     * @param obj
     * @return 
     */
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Instructor other = (Instructor) obj;
        if (!Objects.equals(this.officeHours, other.officeHours)) {
            return false;
        }
        return true;
    }
    /**
     * To String
     * @return 
     */
    @Override
    public String toString() {
        return super.toString() + "\nOffice Hours:                 " + officeHours
                + "\n-------------------------------------------------------";
    }

}
