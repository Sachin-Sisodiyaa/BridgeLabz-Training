package com.TwentyOneQuestions;

public class Employee {
	private String id;
	private String name;
	private int age;
	private String gender;
	private String department;
	private int yearOfJoining;
	private double salary;
	
	

	public Employee(String id, String name, int age, String gender, String department, int yearOfJoining,
			double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
	}



	public String getId() {
		return id;
	}



	public String getName() {
		return name;
	}



	public int getAge() {
		return age;
	}



	public String getGender() {
		return gender;
	}



	public String getDepartment() {
		return department;
	}



	public int getYearOfJoining() {
		return yearOfJoining;
	}



	public double getSalary() {
		return salary;
	}



	public void setId(String id) {
		this.id = id;
	}



	public void setName(String name) {
		this.name = name;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public void setDepartment(String department) {
		this.department = department;
	}



	public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Id: " + id + "\n" +
                "Name: " + name + "\n" +
        		"Age: " + age + "\n" +
                "Gender: " +  gender + "\n" +
        		"Department: " + department + "\n" +
                "YearOfJoining: " + yearOfJoining + "\n" +
        		"Salary: " + salary + "\n";
	}
}
