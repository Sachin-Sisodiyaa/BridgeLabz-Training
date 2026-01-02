package com.inheritance.educationalcoursehierarchy;

public class CourseMain {

    public static void main(String[] args) {

        Course c1 = new Course("Data Structures", 40);
        Course c2 = new OnlineCourse("Java Programming", 50, "Udemy", true);
        Course c3 = new PaidOnlineCourse("AI with Python", 60, "Coursera", true, 5000, 20);

        System.out.println("----- Basic Course -----");
        c1.displayDetails();

        System.out.println("\n----- Online Course -----");
        c2.displayDetails();

        System.out.println("\n----- Paid Online Course -----");
        c3.displayDetails();
    }
}

