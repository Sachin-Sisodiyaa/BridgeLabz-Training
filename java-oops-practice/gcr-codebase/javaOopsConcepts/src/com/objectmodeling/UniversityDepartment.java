package com.objectmodeling;

public class UniversityDepartment {
    private String departmentName;

    public UniversityDepartment(String departmentName) {
        this.departmentName = departmentName;
    }

    public void displayDepartment() {
        System.out.println("Department: " + departmentName);
    }
}

