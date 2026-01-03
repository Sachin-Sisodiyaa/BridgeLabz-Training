package com.encapsulation.ridehailingapplication;

import java.util.ArrayList;

public class RideHailingMain {

    public static void main(String[] args) {

        ArrayList<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("CAR101", "Rahul", 20));
        vehicles.add(new Bike("BIKE202", "Anita", 15));
        vehicles.add(new Auto("AUTO303", "Suresh", 10));

        double distance = 12.5; // km

        System.out.println("---Ride Fare Calculation---");

        // 🔹 Polymorphism: Vehicle reference
        for (Vehicle v : vehicles) {
            v.getVehicleDetails();

            double fare = v.calculateFare(distance);

            System.out.println("Distance      : " + distance + " km");
            System.out.println("Total Fare    : Rs." + fare);

            if (v instanceof GPS) {
                GPS gps = (GPS) v;
                System.out.println("Current Location: " + gps.getCurrentLocation());
                gps.updateLocation("Near User");
                System.out.println("Updated Location: " + gps.getCurrentLocation());
            }

            System.out.println("--------------------------------");
        }
    }
}

