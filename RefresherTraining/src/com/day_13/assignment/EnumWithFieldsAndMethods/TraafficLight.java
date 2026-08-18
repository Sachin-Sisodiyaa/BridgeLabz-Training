package com.day_13.assignment.EnumWithFieldsAndMethods;

public enum TraafficLight {

	RED(30),
    YELLOW(5),
    GREEN(25);
	
	private int duration;
	
	TraafficLight(int duration){
		this.duration = duration;
	}
	
	public int getDuration() {
		return duration;
	}
	
}
