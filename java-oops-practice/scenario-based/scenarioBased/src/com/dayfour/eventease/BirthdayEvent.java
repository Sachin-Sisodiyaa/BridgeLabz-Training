package com.dayfour.eventease;

public class BirthdayEvent extends Event {

    public BirthdayEvent(String name, String location, String date, int attendees,
                          boolean catering, boolean decoration) {

        super(
            name,
            location,
            date,
            attendees,
            8000,
            (catering ? 4000 : 0) + (decoration ? 3000 : 0),
            1000
        );
    }

    @Override
    public void schedule() {
        System.out.println("Birthday event scheduled with fun activities!");
    }

    @Override
    public void reschedule(String newDate) {
        this.date = newDate;
        System.out.println("Birthday event rescheduled to " + newDate);
    }

    @Override
    public void cancel() {
        System.out.println("Birthday event cancelled.");
    }
}
