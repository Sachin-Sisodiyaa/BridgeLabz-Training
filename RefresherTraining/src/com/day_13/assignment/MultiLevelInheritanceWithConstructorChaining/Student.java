package com.day_13.assignment.MultiLevelInheritanceWithConstructorChaining;

public class Student extends Person {

    String course;

    public Student(String name, String course) {
        super(name);
        this.course = course;
    }
}