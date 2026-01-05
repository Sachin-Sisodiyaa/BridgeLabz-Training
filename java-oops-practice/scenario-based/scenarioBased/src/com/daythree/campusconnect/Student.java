package com.daythree.campusconnect;

import java.util.ArrayList;

class Student extends Person implements ICourseActions {

    private ArrayList<Course> courses;
    private ArrayList<Integer> grades;   // grades kept private

    public Student(int id, String name, String email) {
        super(id, name, email);
        courses = new ArrayList<>();
        grades = new ArrayList<>();
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    // GPA calculation using operators
    public double calculateGPA() {
        int sum = 0;
        for (int g : grades)
            sum += g;

        return grades.size() == 0 ? 0 : (double) sum / grades.size();
    }

    @Override
    public void enrollCourse(Course course) {
        courses.add(course);
        course.addStudent(this);
    }

    @Override
    public void dropCourse(Course course) {
        courses.remove(course);
        course.removeStudent(this);
    }

    @Override
    public void printDetails() {
        System.out.println("Student: " + name + ", GPA: " + calculateGPA());
    }
}

