package acadadminsystem_phase1; /**
 * @author Sonjay Gregory
 */


import java.util.Objects;

public abstract class Person {

    private String firstName;
    private String lastName;

    public Person(String personFirstName, String personLastName) {
        this.firstName = personFirstName;
        this.lastName = personLastName;
    }
/*if person not null*/
    public Person (Person person){
        this.firstName = person.firstName;
        this.lastName = person.lastName;
    }

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
        return "acadadminsystem_phase1.Person{" + "First Name: " + firstName + " Last Name: " + lastName + '}';
    }

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