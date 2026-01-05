package com.dayone.vehiclerentalapplication;

class Customer {

 private String name; // private → encapsulation

 public Customer(String name) {
     this.name = name;
 }

 // Accepts Vehicle reference → runtime polymorphism
 public void rentVehicle(Vehicle vehicle, int days) {
     System.out.println("\nCustomer Name: " + name);
     System.out.println("Vehicle Number: " + vehicle.getVehicleNumber());
     System.out.println("Rental Days: " + days);
     System.out.println("Total Rent: Rs." + vehicle.calculateRent(days));
     System.out.println("------------------------------------");
 }
}

