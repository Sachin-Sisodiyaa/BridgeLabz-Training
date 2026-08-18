package com.day_13.assignment.StaticMethodHidingDemo;

public class Test {

	public static void main(String[] args) {
		Parent p = new Child();
		p.greet();
		Child c = new Child();
		c.greet();

	}

}
