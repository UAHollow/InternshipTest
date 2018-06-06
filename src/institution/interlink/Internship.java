package institution.interlink;

import person.Student;

import java.util.LinkedList;
import java.util.List;

public class Internship {
    private String name;
    private Student student;
    private List<Student> studentsThatPassed = new LinkedList<>();

    public Internship(String name) {
        this.name = name;
    }

    public void setStudentsThatPassed(List<Student> studentsThatPassed) {
        this.studentsThatPassed = studentsThatPassed;
    }

    public String getStudents() {
        StringBuilder stringBuilder = new StringBuilder("");
        for (Student passedStudents : this.studentsThatPassed) {
            stringBuilder.append(passedStudents.getName());
            stringBuilder.append(" ") ;
        }
        return stringBuilder.toString();
    }
}
