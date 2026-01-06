package com.dayfour.edumentor;

public class Instructor extends User {
	
	public Instructor(String name, String email, String userId) {
		super(name, email, userId);
	}
	
	@Override
	void displayDetails() {
		System.out.println("Instructor Name: " + name);
	}
}
