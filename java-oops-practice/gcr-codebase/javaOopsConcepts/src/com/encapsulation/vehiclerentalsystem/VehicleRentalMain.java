package com.encapsulation.vehiclerentalsystem;

import java.util.ArrayList;

public class VehicleRentalMain {

    public static void main(String[] args) {

        ArrayList<Vehicle> vehicles = new ArrayList<>();

        Vehicle v1 = new Car("CAR-101", 2000);
        Vehicle v2 = new Bike("BIKE-202", 500);
        Vehicle v3 = new Truck("TRUCK-303", 4000);

        vehicles.add(v1);
        vehicles.add(v2);
        vehicles.add(v3);

        int rentalDays = 3;

        // 🔹 Polymorphism in action
        for (Vehicle v : vehicles) {

            double rentalCost = v.calculateRentalCost(rentalDays);
            double insuranceCost = 0;

            if (v instanceof Insurable) {
                insuranceCost = ((Insurable) v).calculateInsurance();
            }

            v.showDetails();
            System.out.println("Rental Days : " + rentalDays);
            System.out.println("Rental Cost : Rs." + rentalCost);
            System.out.println("Insurance   : Rs." + insuranceCost);
            System.out.println("Total Cost  : Rs." + (rentalCost + insuranceCost));
            System.out.println("--------------------------------");
        }
    }
}
