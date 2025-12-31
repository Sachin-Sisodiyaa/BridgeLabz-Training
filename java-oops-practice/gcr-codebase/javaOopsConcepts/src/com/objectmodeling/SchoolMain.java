package com.objectmodeling;

public class SchoolMain {
	public static void main(String[] args) {

        // Create school
        School school = new School("Green Valley School");

        // Create students
        Student s1 = new Student("Sachin");
        Student s2 = new Student("Amit");

        // Create courses
        Course c1 = new Course("Mathematics");
        Course c2 = new Course("Computer Science");

        // Aggregation: School has students
        school.addStudent(s1);
        school.addStudent(s2);

        // Association: Students enroll in courses
        s1.enrollCourse(c1);
        s1.enrollCourse(c2);
        s2.enrollCourse(c2);

        // Display
        school.showStudents();
        System.out.println();

        s1.showEnrolledCourses();
        s2.showEnrolledCourses();
        System.out.println();

        c1.showEnrolledStudents();
        c2.showEnrolledStudents();
    }
}
