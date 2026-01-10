package com.dayfive.parkease;

public class Car extends Vehicle {

    public Car(String vehicleNumber) {
        super(vehicleNumber, 50); // ₹50 per hour
    }

    @Override
    public double calculateCharges(int hours) {
        double charge = baseRate * hours;
        if (hours > 5)
            charge += 100; // penalty
        return charge;
    }
}
