package com.encapsulation.vehiclerentalsystem;

abstract class Vehicle {

    // Encapsulated fields
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    // Sensitive field (fully encapsulated)
    private String insurancePolicyNumber;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    // Getters & setters (encapsulation)
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public void setInsurancePolicyNumber(String policyNumber) {
        this.insurancePolicyNumber = policyNumber;
    }

    protected String getInsurancePolicyNumber() {
        return insurancePolicyNumber;
    }

    // Abstract method
    abstract double calculateRentalCost(int days);

    // Common method
    public void showDetails() {
        System.out.println("Vehicle No   : " + vehicleNumber);
        System.out.println("Type         : " + type);
        System.out.println("Rate / Day   : Rs." + rentalRate);
    }
}

