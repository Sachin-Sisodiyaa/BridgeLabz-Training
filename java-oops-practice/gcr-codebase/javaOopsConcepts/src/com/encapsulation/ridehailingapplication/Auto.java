package com.encapsulation.ridehailingapplication;

class Auto extends Vehicle implements GPS {

    private String currentLocation;

    public Auto(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = "Bhopal"; // default
    }

    @Override
    double calculateFare(double distance) {
        return distance * getRatePerKm() + 50; // flat booking charge 50
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

