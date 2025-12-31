package com.objectmodeling;

import java.util.ArrayList;

public class University {
    private String universityName;
    private ArrayList<Department> departments;
    private ArrayList<Faculty> faculties;

    public University(String universityName) {
        this.universityName = universityName;
        this.departments = new ArrayList<>();
        this.faculties = new ArrayList<>();
    }

    // Composition
    public void addDepartment(String deptName) {
        departments.add(new Department(deptName));
    }

    // Aggregation
    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public void displayUniversityDetails() {
        System.out.println("University: " + universityName);

        System.out.println("\nDepartments:");
        for (Department d : departments) {
            d.displayDepartment();
        }

        System.out.println("\nFaculties:");
        for (Faculty f : faculties) {
            f.displayFaculty();
        }
    }

    // Simulating deletion
    public void deleteUniversity() {
        departments.clear(); // Departments destroyed
        System.out.println("\nUniversity deleted. All departments removed.");
    }
}

