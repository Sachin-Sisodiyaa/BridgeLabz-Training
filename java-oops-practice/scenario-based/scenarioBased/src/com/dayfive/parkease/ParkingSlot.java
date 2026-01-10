package com.dayfive.parkease;

import java.util.ArrayList;
import java.util.List;

public class ParkingSlot {

    private int slotId;
    private boolean isOccupied;
    private String vehicleTypeAllowed;

    // internal booking records
    private List<String> bookingLogs = new ArrayList<>();

    public ParkingSlot(int slotId, String vehicleTypeAllowed) {
        this.slotId = slotId;
        this.vehicleTypeAllowed = vehicleTypeAllowed;
        this.isOccupied = false;
    }

    public boolean assignSlot(Vehicle vehicle) {

        if (isOccupied) {
            System.out.println("Slot already occupied!");
            return false;
        }

        if (!vehicle.getClass().getSimpleName().equalsIgnoreCase(vehicleTypeAllowed)) {
            System.out.println("Vehicle type not allowed in this slot!");
            return false;
        }

        isOccupied = true;
        bookingLogs.add("Slot booked by " + vehicle.getVehicleNumber());
        return true;
    }

    public void releaseSlot() {
        isOccupied = false;
        bookingLogs.add("Slot released");
    }

    public boolean isAvailable() {
        return !isOccupied;
    }

    public void showLogs() {
        System.out.println("Booking Logs:");
        for (String log : bookingLogs)
            System.out.println(log);
    }
}
