package com.dayfive.parkease;

public class Truck extends Vehicle {

    public Truck(String vehicleNumber) {
        super(vehicleNumber, 80); // ₹80 per hour
    }

    @Override
    public double calculateCharges(int hours) {
        double charge = baseRate * hours;
        if (hours > 4)
            charge += 200;
        return charge;
    }
}
