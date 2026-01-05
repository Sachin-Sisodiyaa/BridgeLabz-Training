package com.dayone.universityenrollmentsystem;

abstract class Student {

 protected int id;
 protected String name;

 // private → Encapsulation (secured GPA)
 private double gpa;

 public Student(int id, String name) {
     this.id = id;
     this.name = name;
 }

 // GPA calculation using operators
 protected void calculateGPA(int totalPoints, int totalCredits) {
     this.gpa = (double) totalPoints / totalCredits;
 }

 // Public method to access transcript
 public void viewTranscript() {
     System.out.println("Student: " + name);
     System.out.println("GPA: " + gpa);
     System.out.println("----------------------");
 }

 // Abstract → implemented differently by subclasses
 public abstract void enrollCourse(Course course);
}

