package com.dayseven.eduresults;

public class Student {
	
	String state;
	String rollNo;
	int marks;
	
	public Student(String state, String rollNo, int marks) {
		this.state = state;
		this.rollNo = rollNo;
		this.marks = marks;
	}
	
	@Override
    public String toString() {
        return rollNo + " | " + state + " | " + marks;
    }
}
