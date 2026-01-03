package com.encapsulation.ridehailingapplication;

class Bike extends Vehicle implements GPS {

    private String currentLocation;

    public Bike(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = "Anand Nagar"; // default
    }

    @Override
    double calculateFare(double distance) {
        return distance * getRatePerKm() * 0.9; // 10% discount for bike
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        currentLocation = newLocation;
    }
}

