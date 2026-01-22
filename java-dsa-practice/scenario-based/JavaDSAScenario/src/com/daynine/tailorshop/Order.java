package com.daynine.tailorshop;

import java.time.LocalDate;

public class Order {

    LocalDate deadLine;
    String orderId;

    Order(LocalDate deadLine, String orderId) {
        this.deadLine = deadLine;
        this.orderId = orderId;
    }
    
    @Override
    public String toString() {
    	return orderId + "\t|\t" + deadLine;
    }
}
