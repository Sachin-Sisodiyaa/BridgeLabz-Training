package com.constructors.levelone;

public class CircleMain {
	// Main method for testing
    public static void main(String[] args) {
        Circle c1 = new Circle();        // default radius
        Circle c2 = new Circle(5.5);     // user-provided radius

        c1.display();
        c2.display();
    }
}
