package com.daynine.medwarehouse;

import java.time.LocalDate;

public class Medicine {

    String name;
    String batchId;
    LocalDate expiryDate;

    public Medicine(String name, String batchId, LocalDate expiryDate) {
        this.name = name;
        this.batchId = batchId;
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return name + "\t\t" + batchId + "\t\t" + expiryDate;
    }
}

