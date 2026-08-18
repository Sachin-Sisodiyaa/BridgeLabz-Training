package com.day_13.assignment.MultiLevelInheritanceWithConstructorChaining;

public class GraduateStudent extends Student {

    String thesisTitle;

    public GraduateStudent(String name, String course, String thesisTitle) {
        super(name, course);
        this.thesisTitle = thesisTitle;
    }
}