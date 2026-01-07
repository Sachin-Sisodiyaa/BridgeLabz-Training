package com.dayfour.eventease;

public abstract class Event implements ISchedulable {

    private final int eventId;     // cannot be edited once assigned
    protected String eventName;
    protected String location;
    protected String date;
    protected int attendees;

    private double venueCost;
    private double serviceCost;
    private double discount;

    private static int counter = 1000;

    public Event(String eventName, String location, String date, int attendees,
                 double venueCost, double serviceCost, double discount) {

        this.eventId = ++counter;
        this.eventName = eventName;
        this.location = location;
        this.date = date;
        this.attendees = attendees;
        this.venueCost = venueCost;
        this.serviceCost = serviceCost;
        this.discount = discount;
    }

    // cost calculation using operators
    public double calculateTotalCost() {
        return venueCost + serviceCost - discount;
    }

    public int getEventId() {
        return eventId;
    }

    public void displayEventDetails() {
        System.out.println("Event ID   : " + eventId);
        System.out.println("Event Name : " + eventName);
        System.out.println("Location   : " + location);
        System.out.println("Date       : " + date);
        System.out.println("Attendees  : " + attendees);
        System.out.println("Total Cost : Rs." + calculateTotalCost());
    }
}
