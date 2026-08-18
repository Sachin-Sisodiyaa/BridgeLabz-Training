package com.day_13.assignment.MethodOverloadingVsOverridingCombined;

public class Shape2D extends Shape {

    @Override
    void draw() {
        System.out.println("Drawing 2D Shape");
    }

    //Overloading
    void draw(String color) {
        System.out.println("Drawing 2D Shape with color: " + color);
    }
}