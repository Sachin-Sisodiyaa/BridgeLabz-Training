package com.dayone.vehiclerentalapplication;

abstract class Vehicle implements Rentable {

 // protected → accessible in subclasses (Bike, Car, Truck)
 protected String vehicleNumber;
 protected double baseRate;

 // Constructor used by child classes
 public Vehicle(String vehicleNumber, double baseRate) {
     this.vehicleNumber = vehicleNumber;
     this.baseRate = baseRate;
 }

 // Getter methods → Encapsulation
 public String getVehicleNumber() {
     return vehicleNumber;
 }

 public double getBaseRate() {
     return baseRate;
 }
}

