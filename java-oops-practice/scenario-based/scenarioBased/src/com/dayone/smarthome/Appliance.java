package com.dayone.smarthome;

abstract class Appliance implements Controllable {

 private boolean isOn;           // Encapsulated device state
 private int powerConsumption;   // Watts

 // Default constructor
 public Appliance() {
     this.powerConsumption = 100;
     this.isOn = false;
 }

 // User-defined power setting
 public Appliance(int powerConsumption) {
     this.powerConsumption = powerConsumption;
     this.isOn = false;
 }

 // Public method to access internal state safely
 public boolean isOn() {
     return isOn;
 }

 protected void setOn(boolean status) {
     this.isOn = status;
 }

 public int getPowerConsumption() {
     return powerConsumption;
 }
}

