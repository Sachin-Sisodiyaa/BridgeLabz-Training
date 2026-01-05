package com.dayone.universityenrollmentsystem;

class Undergraduate extends Student {

 // Constructor without elective preference
 public Undergraduate(int id, String name) {
     super(id, name);
 }

 @Override
 public void enrollCourse(Course course) {
     System.out.println(name + " enrolled in UG course: " + course.getCourseName());
 }
}

