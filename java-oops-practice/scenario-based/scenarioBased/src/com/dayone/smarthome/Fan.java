package com.dayone.smarthome;

class Fan extends Appliance {

 public Fan(int powerConsumption) {
     super(powerConsumption);
 }

 @Override
 public void turnOn() {
     setOn(true);
     System.out.println("Fan started (Medium speed)");
 }

 @Override
 public void turnOff() {
     setOn(false);
     System.out.println("Fan stopped");
 }
}

