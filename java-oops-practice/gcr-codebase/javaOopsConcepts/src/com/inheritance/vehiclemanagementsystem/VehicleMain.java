package com.inheritance.vehiclemanagementsystem;

public class VehicleMain {

    public static void main(String[] args) {

        Vehicle ev = new ElectricVehicle("Tesla Model 3", 220);
        Vehicle pv = new PetrolVehicle("Honda City", 180);

        System.out.println("----- Electric Vehicle -----");
        ev.displayInfo();
        ((ElectricVehicle) ev).charge();

        System.out.println("\n----- Petrol Vehicle -----");
        pv.displayInfo();
        ((Refuelable) pv).refuel();
    }
}

