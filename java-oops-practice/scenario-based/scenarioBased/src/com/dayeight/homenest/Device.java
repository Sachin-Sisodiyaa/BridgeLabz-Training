package com.dayeight.homenest;

import java.util.ArrayList;
import java.util.List;

public abstract class Device implements IControllable {

    private int deviceId;
    private boolean status;           // encapsulated
    protected double energyUsage;     // allowed for subclasses

    // secure firmware update logs
    private List<String> firmwareLogs = new ArrayList<>();

    public Device(int deviceId) {
        this.deviceId = deviceId;
        this.status = false;
        logUpdate("Device registered");
    }

    // status can’t be changed directly
    protected void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isOn() {
        return status;
    }

    protected void logUpdate(String message) {
        firmwareLogs.add(message);
    }

    public void showFirmwareLogs() {
        System.out.println("Firmware Logs:");
        for (String log : firmwareLogs)
            System.out.println("- " + log);
    }

    public int getDeviceId() {
        return deviceId;
    }
}
