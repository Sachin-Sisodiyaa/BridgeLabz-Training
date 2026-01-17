package com.daysix.artexpo;

import java.time.LocalTime;

public class RegistrationData {
	
	LocalTime time;
	String name;
	
	RegistrationData(LocalTime time, String name){
		this.time = time;
		this.name = name;
	}

}
