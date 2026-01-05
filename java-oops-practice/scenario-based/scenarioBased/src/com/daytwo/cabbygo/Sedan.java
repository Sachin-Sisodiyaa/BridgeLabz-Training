package com.daytwo.cabbygo;

class Sedan extends Vehicle {

 public Sedan(String vehicleNumber) {
     super(vehicleNumber, 4, "Sedan");
 }

 // Rate specific to Sedan
 @Override
 double getRatePerKm() {
     return 15;
 }
}

