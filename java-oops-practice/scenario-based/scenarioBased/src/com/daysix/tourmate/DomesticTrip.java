package com.daysix.tourmate;
class DomesticTrip extends Trip {

    public DomesticTrip(String destination, int duration,
                        Transport transport, Hotel hotel, Activity activity) {
        super(destination, duration, transport, hotel, activity);
    }

    @Override
    public void book() {
        System.out.println("Booking Domestic Trip...");
        System.out.println("Quick confirmation available.");
        showTripDetails();
    }

    @Override
    public void cancel() {
        System.out.println("Domestic Trip cancelled. Instant refund processed.");
    }
}
