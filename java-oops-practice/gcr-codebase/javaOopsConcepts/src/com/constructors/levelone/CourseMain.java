package com.constructors.levelone;

public class CourseMain {
	// Main method for testing
    public static void main(String[] args) {

        Course c1 = new Course("Java Full Stack", 6, 45000);
        Course c2 = new Course("Python with AI", 5, 40000);

        System.out.println("Before Updating Institute Name:\n");
        c1.displayCourseDetails();
        System.out.println();
        c2.displayCourseDetails();

        // Update institute name for all courses
        Course.updateInstituteName("BridgeLabz Solutions");

        System.out.println("\nAfter Updating Institute Name:\n");
        c1.displayCourseDetails();
        System.out.println();
        c2.displayCourseDetails();
    }
}
