package com.constructors.levelone;

public class Course {

    // Instance variables unique for each course
    private String courseName;
    private int duration;      
    private double fee;

    // Class variable common for all courses
    private static String instituteName = "BridgeLabz";

    // Constructor
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method
    public void displayCourseDetails() {
        System.out.println("Institute Name : " + instituteName);
        System.out.println("Course Name    : " + courseName);
        System.out.println("Duration       : " + duration + " months");
        System.out.println("Fee            : " + fee);
    }

    // Class method (static method)
    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }
}
