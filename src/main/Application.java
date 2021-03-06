package main;

import provider.HardcodedStudentsProvider;
import institution.University;
import institution.interlink.Internship;

public class Application {
    public static void main(String[] args) {
        University university = new University("CH.U.I.");
        university.addStudents(new HardcodedStudentsProvider().getStudents());
        Internship internship = new Internship("Interlink");
        internship.setStudents(university.getStudents());

        System.out.println("List of internship's students:");
        System.out.println(internship.getPassedStudents());
    }
}
