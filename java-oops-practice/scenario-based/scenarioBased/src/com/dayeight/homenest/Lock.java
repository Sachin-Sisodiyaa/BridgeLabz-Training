package com.dayeight.homenest;

public class Lock extends Device {

    public Lock(int deviceId) {
        super(deviceId);
        energyUsage = 2;
    }

    @Override
    public void turnOn() {
        setStatus(true);
        logUpdate("Door locked");
        System.out.println("Door LOCKED");
    }

    @Override
    public void turnOff() {
        setStatus(false);
        logUpdate("Door unlocked");
        System.out.println("Door UNLOCKED");
    }

    @Override
    public void reset() {
        setStatus(false);
        logUpdate("Lock reset");
        System.out.println("Lock reset completed");
    }
}
