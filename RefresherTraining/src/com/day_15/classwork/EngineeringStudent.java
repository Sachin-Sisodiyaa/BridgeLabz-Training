package com.day_15.classwork;

public class EngineeringStudent implements Student {

	@Override
	public void code() {
		System.out.println("Students practice coding");
	}
	
	public static void main(String[] args) {
		Student c = new EngineeringStudent();
		c.code();

	}

}
