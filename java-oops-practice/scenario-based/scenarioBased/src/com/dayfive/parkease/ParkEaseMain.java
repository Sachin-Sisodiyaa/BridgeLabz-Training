package com.dayfive.parkease;

import java.util.Scanner;

public class ParkEaseMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Vehicle Type: 1.Car  2.Bike  3.Truck");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Vehicle Number: ");
        String number = sc.nextLine();

        Vehicle vehicle;
        if (choice == 1)
            vehicle = new Car(number);
        else if (choice == 2)
            vehicle = new Bike(number);
        else
            vehicle = new Truck(number);

        System.out.print("Enter Parking Hours: ");
        int hours = sc.nextInt();

        ParkingSlot slot = new ParkingSlot(101, vehicle.getClass().getSimpleName());

        if (slot.assignSlot(vehicle)) {
            double charge = vehicle.calculateCharges(hours);
            System.out.println("Parking Charge: Rs." + charge);
            slot.releaseSlot();
        }

        System.out.println("Slot Available: " + slot.isAvailable());
        slot.showLogs();

        sc.close();
    }
}
