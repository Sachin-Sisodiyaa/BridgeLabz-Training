package com.encapsulation.vehiclerentalsystem;

class Car extends Vehicle implements Insurable {

    public Car(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Car", rentalRate);
    }

    @Override
    double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return 500; // flat insurance
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance (Rs.500)";
    }
}

