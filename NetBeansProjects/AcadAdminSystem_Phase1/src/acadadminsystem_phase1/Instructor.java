/**
 *
 * @author Sonjay
 */
package acadadminsystem_phase1;

public class Instructor extends Person {

    private String officeHours;

    public Instructor(String personFirstName, String personLastName, String officeHours ) {
        super(personFirstName, personLastName);
        this.officeHours = officeHours;
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }
    
    /*
    equals method mountain bike comparing office hours
    */

    @Override
    public String toString() {
        return super.toString() + "\nOffice Hours: " + officeHours;
    }

}
