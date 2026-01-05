package com.dayone.vehiclerentalapplication;

class Car extends Vehicle {

 public Car(String vehicleNumber) {
     super(vehicleNumber, 800);
 }

 @Override
 public double calculateRent(int days) {
     double insuranceCharge = 200;
     return (baseRate * days) + insuranceCharge;
 }
}

