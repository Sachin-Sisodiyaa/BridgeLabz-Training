package com.dayone.smarthome;

//Controls appliances
class UserController {

 // Turn appliance ON (Polymorphism)
 public void switchOn(Controllable device) {
     device.turnOn();
 }

 // Turn appliance OFF
 public void switchOff(Controllable device) {
     device.turnOff();
 }

 // Compare energy usage using operators
 public void compareUsage(Appliance a1, Appliance a2) {

     if (a1.getPowerConsumption() > a2.getPowerConsumption()) {
         System.out.println("First appliance consumes more power");
     } 
     else if (a1.getPowerConsumption() < a2.getPowerConsumption()) {
         System.out.println("Second appliance consumes more power");
     } 
     else {
         System.out.println("Both appliances consume equal power");
     }
 }
}

