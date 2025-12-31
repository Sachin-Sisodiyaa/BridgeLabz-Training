package com.objectmodeling;

public class UniversityMain {
    public static void main(String[] args) {

        // Faculty exists independently
        Faculty f1 = new Faculty("Dr. Sharma", "Computer Science");
        Faculty f2 = new Faculty("Dr. Mehta", "Mathematics");

        // Create University
        University uni = new University("ABC University");

        // Composition: Departments created inside University
        uni.addDepartment("Engineering");
        uni.addDepartment("Science");

        // Aggregation: Faculty added
        uni.addFaculty(f1);
        uni.addFaculty(f2);

        uni.displayUniversityDetails();

        // Delete University
        uni.deleteUniversity();

        // Faculty still exists
        System.out.println("\nFaculty still exists after university deletion:");
        f1.displayFaculty();
        f2.displayFaculty();
    }
}

