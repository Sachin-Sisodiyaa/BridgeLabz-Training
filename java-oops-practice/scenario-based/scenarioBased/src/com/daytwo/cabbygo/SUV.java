package com.daytwo.cabbygo;

class SUV extends Vehicle {

 public SUV(String vehicleNumber) {
     super(vehicleNumber, 6, "SUV");
 }

 // Rate specific to SUV
 @Override
 double getRatePerKm() {
     return 20;
 }
}

