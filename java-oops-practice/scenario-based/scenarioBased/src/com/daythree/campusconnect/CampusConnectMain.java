/*8. "CampusConnect – College Information System"
Story: Your university launches CampusConnect, a portal to manage students, teachers, and
courses. You're developing the academic module.
Requirements:
● Person (base class): common fields like name, email, id.
● Student and Faculty extend Person (use inheritance).
● ICourseActions interface with methods like enrollCourse() and dropCourse().
● Course class has a list of students and a faculty assigned.
● Use constructors to initialize students and courses.
● Use access modifiers: student grades must be private.
● Use operators to calculate GPA based on grades.
● Polymorphism: printDetails() works differently for Student and Faculty.*/



package com.daythree.campusconnect;

import java.util.Scanner;

public class CampusConnectMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Faculty input
        System.out.print("Enter Faculty ID: ");
        int fid = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Faculty Name: ");
        String fname = sc.nextLine();
        System.out.print("Enter Faculty Email: ");
        String femail = sc.nextLine();
        System.out.print("Enter Department: ");
        String dept = sc.nextLine();

        Faculty faculty = new Faculty(fid, fname, femail, dept);

        // Course input
        System.out.print("\nEnter Course Code: ");
        String ccode = sc.nextLine();
        System.out.print("Enter Course Name: ");
        String cname = sc.nextLine();

        Course course = new Course(ccode, cname, faculty);

        // Student input
        System.out.print("\nEnter Student ID: ");
        int sid = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Student Name: ");
        String sname = sc.nextLine();
        System.out.print("Enter Student Email: ");
        String semail = sc.nextLine();

        Student student = new Student(sid, sname, semail);

        // Enrollment
        student.enrollCourse(course);

        // Grades input
        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter grade: ");
            student.addGrade(sc.nextInt());
        }

        System.out.println("\n--- DETAILS ---");
        student.printDetails();
        faculty.printDetails();
        course.displayCourse();

        sc.close();
    }
}

