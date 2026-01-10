package com.daysix.medistore;

import java.time.LocalDate;

class Tablet extends Medicine {

    public Tablet(String name, double price, LocalDate expiryDate) {
        super(name, price, expiryDate);
    }

    @Override
    public boolean checkExpiry() {
        // Tablets are preserved → allow 30-day buffer
        return expiryDate.plusDays(30).isBefore(LocalDate.now());
    }
}
