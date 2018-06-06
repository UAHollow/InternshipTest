package institution.interlink;

import person.Student;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Internship {
    private String name;
    private List<Student> students = new ArrayList<>();
    public Internship(String name) {
        this.name = name;
    }

    public void setStudents(List<Student> students){
        this.students = students;
    }

    public List<Student> getStudents(){
        return this.students;
    }

    private List<Student> choosePassingStudents(){
        List<Student> studentsThatPassed = new LinkedList<>();
        for (Student studentsUndergoingATest : this.students) {
            if (studentsUndergoingATest.getKnowledge().getLevel() >= 3){
                studentsThatPassed.add(studentsUndergoingATest);
            }
        }
        return studentsThatPassed;
    }

    public String getPassedStudents() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Student passedStudents : choosePassingStudents()) {
            stringBuilder.append(passedStudents.getName());
            stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }
}
