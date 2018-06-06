package provider;

import person.Student;

import java.util.ArrayList;
import java.util.List;

public class HardcodedStudentsProvider implements StudentsProvider{
    @Override
    public List<Student> getStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student("Andrew Kostenko"));
        students.add(new Student("Julia Veselkina"));
        students.add(new Student("Maria Perechrest"));
        students.add(new Student("Alexandr Borovskiy"));
        students.add(new Student("Anton Zinchenko"));
        students.add(new Student("Olexiy Volik"));
        return students;
    }
}
