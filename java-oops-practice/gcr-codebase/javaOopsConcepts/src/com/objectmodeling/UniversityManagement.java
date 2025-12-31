package com.objectmodeling;

import java.util.ArrayList;

public class UniversityManagement {

    private String universityName;
    private ArrayList<UniversityManagementStudent> students;
    private ArrayList<UniversityManagementProfessor> professors;
    private ArrayList<UniversityManagementCourse> courses;

    public UniversityManagement(String universityName) {
        this.universityName = universityName;
        students = new ArrayList<>();
        professors = new ArrayList<>();
        courses = new ArrayList<>();
    }

    public void addStudent(UniversityManagementStudent student) {
        students.add(student);
    }

    public void addProfessor(UniversityManagementProfessor professor) {
        professors.add(professor);
    }

    public void addCourse(UniversityManagementCourse course) {
        courses.add(course);
    }

    public void showUniversityDetails() {
        System.out.println("University: " + universityName);
        System.out.println("Total Students: " + students.size());
        System.out.println("Total Professors: " + professors.size());
        System.out.println("Total Courses: " + courses.size());
    }
}

