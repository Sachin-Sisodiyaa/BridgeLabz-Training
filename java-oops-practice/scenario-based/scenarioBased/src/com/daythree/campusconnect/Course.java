package com.daythree.campusconnect;

import java.util.ArrayList;

class Course {

    private String courseCode;
    private String courseName;
    private Faculty faculty;
    private ArrayList<Student> students;

    public Course(String code, String name, Faculty faculty) {
        courseCode = code;
        courseName = name;
        this.faculty = faculty;
        students = new ArrayList<>();
    }

    public void addStudent(Student s) {
        students.add(s);
    }

    public void removeStudent(Student s) {
        students.remove(s);
    }

    public void displayCourse() {
        System.out.println(courseCode + " - " + courseName);
        System.out.println("Faculty: " + faculty.getName());
        System.out.println("Total Students: " + students.size());
    }
}

