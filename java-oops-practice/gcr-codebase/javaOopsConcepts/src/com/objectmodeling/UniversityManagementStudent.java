package com.objectmodeling;

import java.util.ArrayList;

public class UniversityManagementStudent {

    private String studentName;
    private ArrayList<UniversityManagementCourse> courses;

    public UniversityManagementStudent(String studentName) {
        this.studentName = studentName;
        this.courses = new ArrayList<>();
    }

    public String getStudentName() {
        return studentName;
    }

    // Communication method
    public void enrollCourse(UniversityManagementCourse course) {
        courses.add(course);
        course.addStudent(this);
        System.out.println(studentName + " enrolled in " + course.getCourseName());
    }

    public void showEnrolledCourses() {
        System.out.println("Courses enrolled by " + studentName + ":");
        for (UniversityManagementCourse c : courses) {
            System.out.println("- " + c.getCourseName());
        }
    }
}


