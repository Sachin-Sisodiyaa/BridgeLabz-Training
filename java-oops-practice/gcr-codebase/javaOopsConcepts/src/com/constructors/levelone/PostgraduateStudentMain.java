package com.constructors.levelone;

public class PostgraduateStudentMain {
	// Main method for testing
    public static void main(String[] args) {

        PostgraduateStudent pg = new PostgraduateStudent(101, "Sachin", 8.6);

        pg.displayDetails();

        // Modify CGPA using public method
        pg.setCGPA(9.1);

        System.out.println("\nAfter CGPA Update:");
        pg.displayDetails();
    }
}
