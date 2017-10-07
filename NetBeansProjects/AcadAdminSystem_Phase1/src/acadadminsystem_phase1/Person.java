/**
 * @author Sonjay Gregory
 */
package acadadminsystem_phase1;

import java.util.Objects;

public abstract class Person {

    private String firstName;
    private String lastName;
    
    /**
     * Contructor
     * @param personFirstName
     * @param personLastName 
     */
    public Person(String personFirstName, String personLastName) {
        this.firstName = personFirstName;
        this.lastName = personLastName;
    }
    
    /**
     * Copy Constructor
     * @param person 
     */
    public Person(Person person) {
        if (person != null) {
            this.firstName = person.firstName;
            this.lastName = person.lastName;
        }
    }
    
    /**
     * Getters and Setters
     * @return 
     */
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String toString() {
        return "\nFirst Name:                   " + firstName + 
                "\nLast Name:                    " + lastName;
    }
    
    /**
     * Equals Function
     * @param objPerson
     * @return 
     */
    @Override
    public boolean equals(Object objPerson) {
        if (this == objPerson) {
            return true;
        }
        if (objPerson == null) {
            return false;
        }
        if (getClass() != objPerson.getClass()) {
            return false;
        }
        final Person other = (Person) objPerson;
        if (!Objects.equals(this.firstName, other.firstName)) {
            return false;
        }
        if (!Objects.equals(this.lastName, other.lastName)) {
            return false;
        }
        return true;
    }
}
