package com.encapsulation.vehiclerentalsystem;

class Truck extends Vehicle implements Insurable {

    public Truck(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Truck", rentalRate);
    }

    @Override
    double calculateRentalCost(int days) {
        return (getRentalRate() * days) + 1000; // loading charge
    }

    @Override
    public double calculateInsurance() {
        return 1000;
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance (Rs.1000)";
    }
}
