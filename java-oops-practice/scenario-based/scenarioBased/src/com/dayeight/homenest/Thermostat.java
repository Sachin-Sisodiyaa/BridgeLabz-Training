package com.dayeight.homenest;

public class Thermostat extends Device {

    private int temperature = 24;

    public Thermostat(int deviceId) {
        super(deviceId);
        energyUsage = 15;
    }

    @Override
    public void turnOn() {
        setStatus(true);
        logUpdate("Thermostat ON");
        System.out.println("Thermostat running at " + temperature + "°C");
    }

    @Override
    public void turnOff() {
        setStatus(false);
        logUpdate("Thermostat OFF");
        System.out.println("Thermostat turned OFF");
    }

    @Override
    public void reset() {
        temperature = 24;
        logUpdate("Thermostat reset");
        System.out.println("Thermostat reset to default temperature");
    }
}

