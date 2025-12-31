package com.objectmodeling;

import java.util.ArrayList;

public class UniversityManagementCourse {

    private String courseName;
    private UniversityManagementProfessor professor;
    private ArrayList<UniversityManagementStudent> students;

    public UniversityManagementCourse(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void assignProfessor(UniversityManagementProfessor professor) {
        this.professor = professor;
    }

    public void addStudent(UniversityManagementStudent student) {
        students.add(student);
    }

    public void showCourseDetails() {
        System.out.println("Course: " + courseName);
        System.out.println("Professor: " +
                (professor != null ? professor.getProfessorName() : "Not Assigned"));

        System.out.println("Enrolled Students:");
        for (UniversityManagementStudent s : students) {
            System.out.println("- " + s.getStudentName());
        }
    }
}

