package com.objectmodeling;

import java.util.ArrayList;

public class UniversityManagementProfessor {

    private String professorName;
    private ArrayList<UniversityManagementCourse> courses;

    public UniversityManagementProfessor(String professorName) {
        this.professorName = professorName;
        this.courses = new ArrayList<>();
    }

    public String getProfessorName() {
        return professorName;
    }

    // Communication method
    public void assignCourse(UniversityManagementCourse course) {
        courses.add(course);
        course.assignProfessor(this);
        System.out.println(professorName + " assigned to teach " + course.getCourseName());
    }

    public void showCourses() {
        System.out.println("Courses taught by " + professorName + ":");
        for (UniversityManagementCourse c : courses) {
            System.out.println("- " + c.getCourseName());
        }
    }
}
