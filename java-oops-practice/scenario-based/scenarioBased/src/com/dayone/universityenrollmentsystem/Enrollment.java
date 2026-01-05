package com.dayone.universityenrollmentsystem;

class Enrollment implements Graded {

 private Student student;
 private Course course;
 private int gradePoints; // secured

 public Enrollment(Student student, Course course) {
     this.student = student;
     this.course = course;
 }

 // Polymorphic grading logic
 @Override
 public void assignGrade(String grade) {

     // Letter grading system
     if (grade.equals("A")) gradePoints = 10;
     else if (grade.equals("B")) gradePoints = 8;
     else if (grade.equals("C")) gradePoints = 6;
     else gradePoints = 0;

     // GPA calculation
     student.calculateGPA(
             gradePoints * course.getCredits(),
             course.getCredits()
     );
 }
}

