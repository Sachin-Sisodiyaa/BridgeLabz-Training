package com.objectmodeling;

import java.util.ArrayList;

public class Company {

    private String companyName;
    private ArrayList<Department> departments;

    public Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }

    // Create departments INSIDE company (composition)
    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void displayCompanyDetails() {
        System.out.println("Company Name: " + companyName);
        for (Department dept : departments) {
            dept.displayDepartment();
        }
    }
}
