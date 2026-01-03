package com.encapsulation.ridehailingapplication;

class Car extends Vehicle implements GPS {

    private String currentLocation;

    public Car(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = "Delhi"; // default
    }

    @Override
    double calculateFare(double distance) {
        return distance * getRatePerKm(); // flat per km
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

