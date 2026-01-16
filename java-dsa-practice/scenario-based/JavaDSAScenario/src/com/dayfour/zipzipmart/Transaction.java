package com.dayfour.zipzipmart;

import java.time.LocalDate;

class Transaction {
    LocalDate date;
    double amount;

    Transaction(LocalDate date, double amount) {
        this.date = date;
        this.amount = amount;
    }
}
