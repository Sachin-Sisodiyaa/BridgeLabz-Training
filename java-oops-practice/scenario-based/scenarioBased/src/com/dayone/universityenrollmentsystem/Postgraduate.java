package com.dayone.universityenrollmentsystem;

class Postgraduate extends Student {

 private String electivePreference;

 // Constructor with elective preference
 public Postgraduate(int id, String name, String electivePreference) {
     super(id, name);
     this.electivePreference = electivePreference;
 }

 @Override
 public void enrollCourse(Course course) {
     System.out.println(name + " enrolled in PG course: " + course.getCourseName()
             + " | Elective: " + electivePreference);
 }
}

