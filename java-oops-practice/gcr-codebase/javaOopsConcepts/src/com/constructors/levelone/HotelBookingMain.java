package com.constructors.levelone;

public class HotelBookingMain {
	// Main method for testing
    public static void main(String[] args) {

        // Using default constructor
        HotelBooking b1 = new HotelBooking();

        // Using parameterized constructor
        HotelBooking b2 = new HotelBooking("Sachin", "Deluxe", 3);

        // Using copy constructor
        HotelBooking b3 = new HotelBooking(b2);

        System.out.println("Default Booking:");
        b1.displayBooking();

        System.out.println("\nParameterized Booking:");
        b2.displayBooking();

        System.out.println("\nCopied Booking:");
        b3.displayBooking();
    }
}
