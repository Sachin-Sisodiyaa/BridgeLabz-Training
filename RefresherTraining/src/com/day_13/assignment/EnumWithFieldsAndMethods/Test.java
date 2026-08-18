package com.day_13.assignment.EnumWithFieldsAndMethods;

public class Test {

	public static void main(String[] args) {
		for(TraafficLight light: TraafficLight.values()) {
			System.out.println(light.name() + " : " + light.getDuration() + " seconds");
		}

	}

}
