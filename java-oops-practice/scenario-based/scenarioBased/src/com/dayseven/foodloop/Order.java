package com.dayseven.foodloop;

import java.util.ArrayList;

class Order implements IOrderable {

    private ArrayList<FoodItem> items;
    private double total;

    public Order(ArrayList<FoodItem> items) {
        this.items = items;
        calculateTotal();
    }

    private void calculateTotal() {
        total = 0;
        for (FoodItem item : items) {
            total += item.getPrice();
        }
        total = applyDiscount(total);
    }

    // Polymorphism: discount varies by total
    protected double applyDiscount(double amount) {
        if (amount > 1000) {
            return amount - (amount * 0.20);
        } else if (amount > 500) {
            return amount - (amount * 0.10);
        }
        return amount;
    }

    @Override
    public void placeOrder() {
        System.out.println("Order placed successfully");
        System.out.println("Total Payable: Rs." + total);
    }

    @Override
    public void cancelOrder() {
        System.out.println("Order cancelled. Refund initiated.");
    }
}
