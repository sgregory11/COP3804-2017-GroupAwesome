/*
Programmer: Jorge Armas
Group Member: 4
Project: Implementation of the TransientStudent and School classes.
 */
package acadadminsystem_phase1;

/**
 * This class represents a student whose home institution is another college,
 * but is taking a few courses at this school..
 *
 * @author Jorge Armas
 */
public class TransientStudent extends Students {

    //additional instance field
    private String homeInstitution;

    //This constructor initializes the fields to the passed values.
    public TransientStudent(String firstN, String lastN, int stuId, String dateOfAd, String major, ArrayList<CourseGrade> courseT, String homeIns) {
        // call the constructor in the super class
        super(firstN, lastN, stuId, dateOfAd, major, courseT);

        // set the fields in this class
        homeInstitution = homeIns;
    }

    /**
     * This is a copy constructor. It initializes the fields of the object being
     * created to the same values as the fields in the object passed as an
     * argument.
     *
     * @param tranObject The object to copy.
     */
    public TransientStudent(TransientStudent tranObj) {
        super(studObj);
        if (studObj != null) {
            homeInstitution = tranObj.homeInstitution;

        }
    }
    //The gethomeInstitution method returns a Transient object's home institution.

    public String gethomeInstitution() {
        return homeInstitution;
    }

    //The sethomeInstitution method stores a value in the home institution field.    
    public void sethomeInstitution(String homeIns) {
        homeInstitution = homeIns;
    }

    //The toString method returns a string representing the state of a TransientStudent object.
    public String toString() {
        // Create a string representing the object.
        String output = super.toString()
                + "Home Institution: " + homeInstitution + "\n";

        return output;

    }
}
