package com.constructors.levelone;

public class VehicleMain {
	// Main method for testing
    public static void main(String[] args) {

        Vehicle v1 = new Vehicle("Sachin", "Car");
        Vehicle v2 = new Vehicle("Amit", "Bike");

        System.out.println("Before Fee Update:\n");
        v1.displayVehicleDetails();
        System.out.println();
        v2.displayVehicleDetails();

        // Update registration fee for all vehicles
        Vehicle.updateRegistrationFee(2000.0);

        System.out.println("\nAfter Fee Update:\n");
        v1.displayVehicleDetails();
        System.out.println();
        v2.displayVehicleDetails();
    }
}
