package com.daysix.medistore;

import java.time.LocalDate;

class Injection extends Medicine {

    public Injection(String name, double price, LocalDate expiryDate) {
        super(name, price, expiryDate);
    }

    @Override
    public boolean checkExpiry() {
        // Liquid + sensitive → strict expiry
        return expiryDate.isBefore(LocalDate.now());
    }
}
