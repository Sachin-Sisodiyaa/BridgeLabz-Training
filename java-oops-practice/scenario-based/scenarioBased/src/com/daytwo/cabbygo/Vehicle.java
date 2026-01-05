package com.daytwo.cabbygo;

abstract class Vehicle implements IRideService {

 // Protected → accessible to subclasses
 protected String vehicleNumber;
 protected int capacity;
 protected String type;

 // Private fare → hidden from outside
 private double fare;

 protected static final double baseFare = 50;

 // Constructor to initialize vehicle details
 public Vehicle(String vehicleNumber, int capacity, String type) {
     this.vehicleNumber = vehicleNumber;
     this.capacity = capacity;
     this.type = type;
 }

 // Abstract method → implemented by subclasses
 abstract double getRatePerKm();

 // Concrete method to book ride and calculate fare
 @Override
 public void bookRide(double distance) {
     fare = baseFare + (distance * getRatePerKm());
     System.out.println("Ride booked successfully!");
     System.out.println("Fare: Rs." + fare);
 }

 // Concrete method
 public void endRide() {
     System.out.println("Ride ended. Thank you!");
 }

 // Display vehicle details
 public void showVehicleDetails() {
     System.out.println("Vehicle Number : " + vehicleNumber);
     System.out.println("Vehicle Type   : " + type);
     System.out.println("Capacity       : " + capacity);
 }
}

