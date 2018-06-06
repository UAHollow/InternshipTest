package institution;

import person.Student;
import person.consciousness.Knowledge;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class University {
    private String name;
    private List<Student> students = new LinkedList<>();

    public University(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    private  void giveStudentsKnowledge(){
        Random random = new Random();
        for (Student studWithoutKnowledge :this.students) {
            studWithoutKnowledge.setKnowledge(new Knowledge(random.nextInt(5)));
        }
    }

    public void addStudents(List<Student> students) {
        this.students = students;
        giveStudentsKnowledge();
    }


}
