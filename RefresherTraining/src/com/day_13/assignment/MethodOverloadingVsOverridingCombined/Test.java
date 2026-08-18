package com.day_13.assignment.MethodOverloadingVsOverridingCombined;

public class Test {

    public static void main(String[] args) {

        Shape2D s = new Shape2D();

        //Overridden
        s.draw();

        //Overloaded
        s.draw("Red");
    }
}