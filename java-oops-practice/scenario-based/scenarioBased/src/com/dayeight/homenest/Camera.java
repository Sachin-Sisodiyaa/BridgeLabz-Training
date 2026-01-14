package com.dayeight.homenest;

public class Camera extends Device {

    public Camera(int deviceId) {
        super(deviceId);
        energyUsage = 10;
    }

    @Override
    public void turnOn() {
        setStatus(true);
        logUpdate("Camera activated");
        System.out.println("Camera recording started");
    }

    @Override
    public void turnOff() {
        setStatus(false);
        logUpdate("Camera deactivated");
        System.out.println("Camera turned OFF");
    }

    @Override
    public void reset() {
        setStatus(false);
        logUpdate("Camera reset and recalibrated");
        System.out.println("Camera reset completed");
    }
}

