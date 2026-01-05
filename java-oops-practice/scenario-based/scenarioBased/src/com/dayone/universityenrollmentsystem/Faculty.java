package com.dayone.universityenrollmentsystem;

class Faculty {

 private String facultyName;

 public Faculty(String facultyName) {
     this.facultyName = facultyName;
 }

 public void gradeStudent(Graded enrollment, String grade) {
     System.out.println("Faculty " + facultyName + " assigning grade: " + grade);
     enrollment.assignGrade(grade);
 }
}

