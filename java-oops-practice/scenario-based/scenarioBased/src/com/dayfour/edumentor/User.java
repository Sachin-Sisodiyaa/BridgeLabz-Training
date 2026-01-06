package com.dayfour.edumentor;

public class User {
	
	protected String name;
	protected String email;
	protected String userId;
	
	public User(String name, String email, String userId) {
		this.name = name;
		this.email = email;
		this.userId = userId;
	}

	void displayDetails() {
		System.out.println("Name: " + name);
		System.out.println("Email: " + email);
		System.out.println("User ID: " + userId);
	}
}
