/**
 *
 * @author Sonjay
 */
package acadadminsystem_phase1;

import java.util.Objects;

public class DualEnrolledStudent extends Student {

    private String highSchoolName;
    private int highSchoolGrade;

    public DualEnrolledStudent(String highSchoolName, int highSchoolGrade) {
        this.highSchoolName = highSchoolName;
        this.highSchoolGrade = highSchoolGrade;
    }

    public String getHighSchoolName() {
        return highSchoolName;
    }

    public int getHighSchoolGrade() {
        return highSchoolGrade;
    }

    public void setHighSchoolName(String highSchoolName) {
        this.highSchoolName = highSchoolName;
    }

    public void setHighSchoolGrade(int highSchoolGrade) {
        this.highSchoolGrade = highSchoolGrade;
    }

    @Override
    public String toString() {
        return "DualEnrolledStudent{" + "highSchoolName=" + highSchoolName + ", highSchoolGrade=" + highSchoolGrade + '}';
    }

}
