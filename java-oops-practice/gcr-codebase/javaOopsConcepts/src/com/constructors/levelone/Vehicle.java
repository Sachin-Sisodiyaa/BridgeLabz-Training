package com.constructors.levelone;

public class Vehicle {

    // Instance variables unique for each vehicle
    private String ownerName;
    private String vehicleType;

    // Class variable common for all vehicles
    private static double registrationFee = 1500.0;

    // Constructor
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method
    public void displayVehicleDetails() {
        System.out.println("Owner Name        : " + ownerName);
        System.out.println("Vehicle Type      : " + vehicleType);
        System.out.println("Registration Fee  : ₹" + registrationFee);
    }

    // Class method -- static method
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
}

