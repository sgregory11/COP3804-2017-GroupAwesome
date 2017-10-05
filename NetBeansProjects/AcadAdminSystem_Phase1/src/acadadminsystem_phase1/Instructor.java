/**
 *
 * @author Sonjay
 */
package acadadminsystem_phase1;

public class Instructor extends Person {

    private String officeHours;

    public Instructor(String officeHours, String personFirstName, String personLastName) {
        super(personFirstName, personLastName);
        this.officeHours = officeHours;
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    @Override
    public String toString() {
        return "Instructor: " + officeHours;
    }

}
