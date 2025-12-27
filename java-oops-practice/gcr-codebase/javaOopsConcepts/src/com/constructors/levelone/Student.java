package com.constructors.levelone;

public class Student {

    public int rollNumber;      
    protected String name;     
    private double cgpa;       

    // Constructor
    public Student(int rollNumber, String name, double cgpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.cgpa = cgpa;
    }

    // Public getter for CGPA
    public double getCGPA() {
        return cgpa;
    }

    // Public setter for CGPA
    public void setCGPA(double cgpa) {
        this.cgpa = cgpa;
    }
}

