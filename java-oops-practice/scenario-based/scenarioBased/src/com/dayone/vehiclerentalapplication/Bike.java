package com.dayone.vehiclerentalapplication;

class Bike extends Vehicle {

 // Custom constructor for Bike
 public Bike(String vehicleNumber) {
     super(vehicleNumber, 300); // base rate per day
 }

 // Polymorphic method implementation
 @Override
 public double calculateRent(int days) {
     return baseRate * days; // Operator usage
 }
}

