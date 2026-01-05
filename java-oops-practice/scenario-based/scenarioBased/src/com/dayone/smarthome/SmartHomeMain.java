/*5. Smart Home Automation System
Scenario: Users can control appliances like lights, fans, ACs via a smart interface.
Concepts Used:
● Class: Appliance, Light, Fan, AC, UserController

Scenario-based Problems

● Constructor: Set default or user-defined power settings
● Access Modifiers: Internal device settings as private, toggle methods as public
● Interface: Controllable with methods turnOn(), turnOff()
● Operators: Compare energy usage (>, <, ==)
● OOP:
○ Encapsulation: Control internal appliance state
○ Abstraction: Devices follow common control interface
○ Inheritance: Device types inherit from Appliance
○ Polymorphism: Turning on a Light vs an AC involves different behaviors*/



package com.dayone.smarthome;

public class SmartHomeMain {

    public static void main(String[] args) {

        // Creating appliances
        Appliance light = new Light();
        Appliance fan = new Fan(70);
        Appliance ac = new AC(1500);

        // User controller
        UserController controller = new UserController();

        // Polymorphic control
        controller.switchOn(light);
        controller.switchOn(fan);
        controller.switchOn(ac);

        // Power comparison
        controller.compareUsage(light, ac);

        // Switching OFF
        controller.switchOff(fan);
        controller.switchOff(ac);
    }
}

