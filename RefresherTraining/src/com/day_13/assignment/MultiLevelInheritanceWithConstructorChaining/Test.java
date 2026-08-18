package com.day_13.assignment.MultiLevelInheritanceWithConstructorChaining;

public class Test {

    public static void main(String[] args) {

        GraduateStudent g = new GraduateStudent(
                "Sachin",
                "AI & ML",
                "Artificial Intelligence in Healthcare"
        );

        System.out.println("Name: " + g.name);
        System.out.println("Course: " + g.course);
        System.out.println("Thesis Title: " + g.thesisTitle);
    }
}