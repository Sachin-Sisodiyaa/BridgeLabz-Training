/*21. "SkillForge – Online Learning Portal"
Story: A startup builds SkillForge, where instructors upload courses and students enroll,
complete, and get certified.
Requirements:
● Course class: title, instructor, rating, modules[].
● User class → Student, Instructor (inheritance).
● Interface ICertifiable with generateCertificate() method.
● Constructors for courses with default or custom module lists.
● Use operators for grading, progress tracking.
● Encapsulation: course rating logic protected.
● Polymorphism: certificate format varies per course level.
● Access Modifiers: internal course reviews are read-only.*/






package com.dayseven.skillforge;

import java.util.Scanner;

public class SkillForgeMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Instructor creation
        System.out.print("Enter Instructor Name: ");
        String instrName = sc.nextLine();

        Instructor instructor = new Instructor(instrName, "instructor@example.com", 101);

        // Course creation
        System.out.print("Enter Course Title: ");
        String title = sc.nextLine();

        System.out.print("How many modules? ");
        int modCount = sc.nextInt();
        sc.nextLine();

        String[] modules = new String[modCount];
        for (int i = 0; i < modCount; i++) {
            System.out.print("Module " + (i + 1) + ": ");
            modules[i] = sc.nextLine();
        }

        Course course = new Course(title, instructor, modules);
        course.setRating(4.5);

        course.showCourseDetails();

        // Student creation
        System.out.print("\nEnter Student Name: ");
        String studName = sc.nextLine();
        Student student = new Student(studName, "student@example.com", 201);

        System.out.print("Enter modules completed: ");
        int completed = sc.nextInt();
        student.completeModule(course.getModuleCount(), completed);

        student.generateCertificate();
        instructor.generateCertificate();

        sc.close();
    }
}

