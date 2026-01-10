package com.daysix.medistore;

import java.time.LocalDate;

class Syrup extends Medicine {

    public Syrup(String name, double price, LocalDate expiryDate) {
        super(name, price, expiryDate);
    }

    @Override
    public boolean checkExpiry() {
        // Liquid meds → strict expiry
        return expiryDate.isBefore(LocalDate.now());
    }
}
