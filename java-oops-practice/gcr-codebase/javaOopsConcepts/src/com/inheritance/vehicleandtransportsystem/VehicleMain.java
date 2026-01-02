package com.inheritance.vehicleandtransportsystem;

public class VehicleMain {

    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[3];

        vehicles[0] = new Car(180, "Petrol", 5);
        vehicles[1] = new Truck(120, "Diesel", 15);
        vehicles[2] = new Motorcycle(150, "Petrol", true);

        for (Vehicle v : vehicles) {
            System.out.println("----- Vehicle Details -----");
            v.displayInfo();
        }
    }
}

