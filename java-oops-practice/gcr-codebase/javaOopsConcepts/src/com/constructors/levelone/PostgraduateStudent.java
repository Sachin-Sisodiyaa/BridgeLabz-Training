package com.constructors.levelone;

public class PostgraduateStudent extends Student {

    public PostgraduateStudent(int rollNumber, String name, double cgpa) {
        super(rollNumber, name, cgpa);
    }

    public void displayDetails() {
        System.out.println("Roll Number : " + rollNumber);  
        System.out.println("Name        : " + name);        
        System.out.println("CGPA        : " + getCGPA());  
    }
}

