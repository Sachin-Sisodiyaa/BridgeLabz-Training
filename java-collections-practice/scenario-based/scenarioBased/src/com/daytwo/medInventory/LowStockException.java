package com.daytwo.medInventory;

public class LowStockException extends Exception {

    public LowStockException(String message) {
        super(message);
    }
}