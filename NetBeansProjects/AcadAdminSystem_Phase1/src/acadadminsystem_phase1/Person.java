/**
 * @author Sonjay Gregory
 */
package acadadminsystem_phase1;

import java.util.Objects;

public class Person {
    
    private String firstName;
    private String lastName;

    
    public Person (String personFirstName, String personLastName){
        this.firstName = personFirstName;
        this.lastName = personLastName;
    }
    /*Copy Contructor??
    /*public Person (Person oldPerson){
        this.firstName = oldpersonFirstName.firstName;
        this.lastName = oldpersonLastName.lastName;
    }*/
    
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
        return "Person{" + "firstName=" + firstName + ", lastName=" + lastName + '}';
    }
    
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
        final Person other = (Person) obj;
        if (!Objects.equals(this.firstName, other.firstName)) {
            return false;
        }
        if (!Objects.equals(this.lastName, other.lastName)) {
            return false;
        }
        return true;
    }
}
