package com.dayone.smarthome;

//Air Conditioner device
class AC extends Appliance {

 public AC(int powerConsumption) {
     super(powerConsumption);
 }

 @Override
 public void turnOn() {
     setOn(true);
     System.out.println("AC turned ON (Cooling mode)");
 }

 @Override
 public void turnOff() {
     setOn(false);
     System.out.println("AC turned OFF");
 }
}

