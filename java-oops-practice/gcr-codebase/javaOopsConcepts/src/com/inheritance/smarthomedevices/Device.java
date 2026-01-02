package com.inheritance.smarthomedevices;

public class Device {

    protected String deviceId;
    protected boolean status; // true = ON, false = OFF

    // Constructor
    public Device(String deviceId, boolean status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    // Method to display device status
    public void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + (status ? "ON" : "OFF"));
    }
}

