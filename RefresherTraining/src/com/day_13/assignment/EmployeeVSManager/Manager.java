package com.day_13.assignment.EmployeeVSManager;

class Manager extends Employee{

	int team;
	
	public Manager(int team, String name, double salary) {
		super(name, salary);
		this.team = team;
	}
	
	void getDetails() {
		super.getDetails();
		System.out.println("Team Size: " + team);		
	}
}
