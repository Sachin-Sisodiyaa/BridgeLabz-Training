package com.daysix.tourmate;
class InternationalTrip extends Trip {

    public InternationalTrip(String destination, int duration,
                             Transport transport, Hotel hotel, Activity activity) {
        super(destination, duration, transport, hotel, activity);
    }

    @Override
    public void book() {
        System.out.println("Booking International Trip...");
        System.out.println("Passport & Visa verification required.");
        showTripDetails();
    }

    @Override
    public void cancel() {
        System.out.println("International Trip cancelled. Refund may take 15 days.");
    }
}
