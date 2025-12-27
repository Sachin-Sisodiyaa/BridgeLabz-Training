package com.constructors.levelone;

public class Circle {

    private double radius;
    // constructor chaining

    // Default constructor
    public Circle() {
        this(1.0);   
    }

    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to display radius
    public void display() {
        System.out.println("Radius of Circle: " + radius);
    }
}