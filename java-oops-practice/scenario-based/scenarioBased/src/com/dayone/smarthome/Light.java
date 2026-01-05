package com.dayone.smarthome;

//Light device
class Light extends Appliance {

 public Light() {
	// default light power
     super(40); 
 }

 @Override
 public void turnOn() {
     setOn(true);
     System.out.println("Light turned ON (Soft illumination)");
 }

 @Override
 public void turnOff() {
     setOn(false);
     System.out.println("Light turned OFF");
 }
}

