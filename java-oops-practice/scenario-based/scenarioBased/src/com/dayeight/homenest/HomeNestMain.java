/*22. "HomeNest – Smart Home Device Manager"
Story: A tech company builds HomeNest, a system to control smart lights, ACs, locks, and
cameras.
Requirements:
● Device base class: deviceId, status, energyUsage.
● Subclasses: Light, Camera, Thermostat, Lock.
● Interface IControllable: turnOn(), turnOff(), reset().
● Use constructors to register devices with user.
● Encapsulation: device status cannot be modified externally.
● Operators for energy usage calculations.
● Polymorphism: reset() behavior varies by device.
● Use access modifiers to secure firmware update logs.
*/






package com.dayeight.homenest;

import java.util.Scanner;

public class HomeNestMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Device:");
        System.out.println("1. Light  2. Camera  3. Thermostat  4. Lock");
        int choice = sc.nextInt();

        Device device;

        switch (choice) {
            case 1:
                device = new Light(101);
                break;
            case 2:
                device = new Camera(102);
                break;
            case 3:
                device = new Thermostat(103);
                break;
            default:
                device = new Lock(104);
        }

        device.turnOn();
        System.out.println("Energy Usage: " + device.energyUsage + "W");

        device.reset();
        device.turnOff();

        device.showFirmwareLogs();
        sc.close();
    }
}

