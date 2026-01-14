package com.dayeight.homenest;

public class Light extends Device {

    public Light(int deviceId) {
        super(deviceId);
        energyUsage = 5; // watts
    }

    @Override
    public void turnOn() {
        setStatus(true);
        logUpdate("Light turned ON");
        System.out.println("Light is ON");
    }

    @Override
    public void turnOff() {
        setStatus(false);
        logUpdate("Light turned OFF");
        System.out.println("Light is OFF");
    }

    @Override
    public void reset() {
        setStatus(false);
        energyUsage = 5;
        logUpdate("Light reset");
        System.out.println("Light reset completed");
    }
}
