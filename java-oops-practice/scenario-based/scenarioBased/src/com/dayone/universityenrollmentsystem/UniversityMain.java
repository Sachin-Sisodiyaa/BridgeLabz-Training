/*3. University Course Enrollment System
Scenario: Students should be able to enroll in courses, and faculty can assign grades.
Concepts Used:
● Class: Student, Course, Faculty, Enrollment
● Constructors: Used to create students with/without elective preferences
● Access Modifiers: private for internal GPA fields, public method to access
transcript
● Interface: Graded with method assignGrade()
● Operators: GPA calculations and comparisons (using +, /, etc.)
● OOP:
○ Encapsulation: Secure handling of grades
○ Inheritance: Undergraduate, Postgraduate extend Student

Scenario-based Problems
○ Abstraction: Interface allows different grading styles
○ Polymorphism: assignGrade() works differently for pass/fail vs. letter grading*/



package com.dayone.universityenrollmentsystem;

public class UniversityMain {

    public static void main(String[] args) {

        // Creating courses
        Course java = new Course("CS101", "Java Programming", 4);

        // Creating students
        Student ugStudent = new Undergraduate(1, "Sachin");
        Student pgStudent = new Postgraduate(2, "Rahul", "AI");

        // Enrollment
        Enrollment e1 = new Enrollment(ugStudent, java);
        Enrollment e2 = new Enrollment(pgStudent, java);

        // Faculty
        Faculty faculty = new Faculty("Dr. Sharma");

        // Enrollment process
        ugStudent.enrollCourse(java);
        pgStudent.enrollCourse(java);

        // Grading (Polymorphism)
        faculty.gradeStudent(e1, "A");
        faculty.gradeStudent(e2, "B");

        // Viewing transcript
        ugStudent.viewTranscript();
        pgStudent.viewTranscript();
    }
}

