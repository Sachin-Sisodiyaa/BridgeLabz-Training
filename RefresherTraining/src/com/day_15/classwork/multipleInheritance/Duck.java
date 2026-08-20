package com.day_15.classwork.multipleInheritance;

public class Duck implements Swimmable, Flyable{
	@Override
	public void swim() {
		System.out.println("Duck can swims.");
	}
	@Override
	public void fly() {
		System.out.println("Duck can fly.");
	}

}
