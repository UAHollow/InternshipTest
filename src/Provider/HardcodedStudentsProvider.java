package Provider;

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
        return students;
    }
}
