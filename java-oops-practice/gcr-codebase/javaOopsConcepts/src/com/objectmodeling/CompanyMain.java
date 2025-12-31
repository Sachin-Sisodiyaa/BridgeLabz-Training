package com.objectmodeling;

public class CompanyMain {
	public static void main(String[] args) {

        // Company created
        Company company = new Company("Tech Solutions Pvt Ltd");

        // Departments created
        Department it = new Department("IT");
        Department hr = new Department("HR");

        // Employees added to departments
        it.addEmployee(101, "Sachin");
        it.addEmployee(102, "Amit");

        hr.addEmployee(201, "Neha");

        // Departments added to company
        company.addDepartment(it);
        company.addDepartment(hr);

        // Display details
        company.displayCompanyDetails();

        // When company object goes out of scope,
        // all departments and employees are destroyed automatically
        company = null;
        System.out.println("\nCompany deleted. All departments and employees are removed.");
    }
}
