package com.daytwo.cabbygo;

class Mini extends Vehicle {

 public Mini(String vehicleNumber) {
     super(vehicleNumber, 4, "Mini");
 }

 // Rate specific to Mini
 @Override
 double getRatePerKm() {
     return 10;
 }
}
