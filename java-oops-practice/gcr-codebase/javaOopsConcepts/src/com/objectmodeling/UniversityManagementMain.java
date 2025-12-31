package com.objectmodeling;

public class UniversityManagementMain {
	public static void main(String[] args) {

        UniversityManagement university =
                new UniversityManagement("Global Tech University");

        UniversityManagementStudent s1 =
                new UniversityManagementStudent("Sachin");
        UniversityManagementStudent s2 =
                new UniversityManagementStudent("Amit");

        UniversityManagementProfessor p1 =
                new UniversityManagementProfessor("Dr. Sharma");
        UniversityManagementProfessor p2 =
                new UniversityManagementProfessor("Dr. Mehta");

        UniversityManagementCourse c1 =
                new UniversityManagementCourse("Computer Science");
        UniversityManagementCourse c2 =
                new UniversityManagementCourse("Mathematics");

        university.addStudent(s1);
        university.addStudent(s2);
        university.addProfessor(p1);
        university.addProfessor(p2);
        university.addCourse(c1);
        university.addCourse(c2);

        university.showUniversityDetails();
        System.out.println();

        p1.assignCourse(c1);
        p2.assignCourse(c2);

        s1.enrollCourse(c1);
        s1.enrollCourse(c2);
        s2.enrollCourse(c1);

        System.out.println();
        c1.showCourseDetails();
        System.out.println();
        c2.showCourseDetails();
    }
}
