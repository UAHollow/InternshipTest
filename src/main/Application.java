package main;

import institution.University;
import institution.interlink.Internship;
import person.Student;
import person.consciousness.Knowledge;

public class Application {
    public static void main(String[] args) {
        University university = new University("CH.U.I.");
        university.addStudent(new Student("Andrew Kostenko"));
        university.getStudent().setKnowledge(new Knowledge(4));
        university.addStudent(new Student("Julia Veselkina"));
        university.getStudent().setKnowledge(new Knowledge(3));
        university.addStudent(new Student("Maria Perechrest"));
        university.getStudent().setKnowledge(new Knowledge(2));

        Internship internship = new Internship("Interlink");
        internship.setStudentsThatPassed(university.chooseBetterThanAverageStudents());

        System.out.println("List of internship's students:");
        System.out.println(internship.getStudents());
    }
}
