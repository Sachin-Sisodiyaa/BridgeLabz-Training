package com.inheritance.smarthomedevices;

public class DeviceMain {

    public static void main(String[] args) {

        Device device = new Thermostat("THERMO-101", true, 24);

        device.displayStatus(); //Polymorphic call
    }
}

