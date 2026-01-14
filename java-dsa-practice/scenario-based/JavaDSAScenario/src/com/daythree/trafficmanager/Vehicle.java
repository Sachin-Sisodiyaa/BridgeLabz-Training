package com.daythree.trafficmanager;

public class Vehicle {
    String numberPlate;
    Vehicle next; // Circular linked list pointer

    public Vehicle(String numberPlate) {
        this.numberPlate = numberPlate;
        this.next = null;
    }

    @Override
    public String toString() {
        return numberPlate;
    }
}
