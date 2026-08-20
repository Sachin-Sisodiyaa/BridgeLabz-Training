package com.day_15.classwork.extendAndImplement;

public class GoldenRetriver extends Dog implements Animal{
	@Override
	public void sound() {
		System.out.println("Animal sounds.");
	}
	
	public void color() {
		System.out.println("GoldenRetriver's color is golden.");
	}
}
