package com.dayfour.eventease;

public class ConferenceEvent extends Event {

    public ConferenceEvent(String name, String location, String date, int attendees,
                            boolean catering, boolean decoration) {

        super(
            name,
            location,
            date,
            attendees,
            15000,
            (catering ? 6000 : 0) + (decoration ? 4000 : 0),
            2000
        );
    }

    @Override
    public void schedule() {
        System.out.println("Conference scheduled with professional setup.");
    }

    @Override
    public void reschedule(String newDate) {
        this.date = newDate;
        System.out.println("Conference rescheduled to " + newDate);
    }

    @Override
    public void cancel() {
        System.out.println("Conference event cancelled.");
    }
}
