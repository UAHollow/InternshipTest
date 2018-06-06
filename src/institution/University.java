package institution;

import person.Student;

import java.util.LinkedList;
import java.util.List;

public class University {
    private String name;
    private Student student;
    private List<Student> students = new LinkedList<>();

    public University(String name) {
        this.name = name;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void addStudent(Student student) {
        setStudent(student);
        students.add(student);
    }

    public List<Student> chooseBetterThanAverageStudents(){
        List<Student> studentsThatPassed = new LinkedList<>();
        for (Student studentsUndergoingATest : this.students) {
            if (studentsUndergoingATest.getKnowledge().getLevel() >= 3){
                studentsThatPassed.add(studentsUndergoingATest);
            }
        }
        return studentsThatPassed;
    }
}
