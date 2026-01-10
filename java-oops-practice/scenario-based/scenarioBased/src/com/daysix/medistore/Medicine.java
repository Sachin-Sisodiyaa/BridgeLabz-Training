/*17. "MediStore – Pharmacy Inventory & Sales System"
Story: A pharmacy chain needs an app to manage drug inventory, sales, and expiry tracking.
Requirements:
● Medicine class: name, price, expiryDate, quantity.
● Interface ISellable with sell() and checkExpiry() methods.
● Constructors for medicines with default quantity.
● Use operators: total price, discount, stock adjustments.
● Encapsulation: internal stock and cost details are hidden.
● Inheritance: Tablet, Syrup, Injection extend Medicine.
● Polymorphism: checkExpiry() works differently for preserved vs liquid meds.
● Access Modifiers: make sensitive pricing logic private.*/


package com.daysix.medistore;

import java.time.LocalDate;

abstract class Medicine implements ISellable {

    protected String name;
    private double price;
    protected LocalDate expiryDate;
    private int quantity;

    // Constructor with default quantity
    public Medicine(String name, double price, LocalDate expiryDate) {
        this(name, price, expiryDate, 10);
    }

    // Constructor with custom quantity
    public Medicine(String name, double price, LocalDate expiryDate, int quantity) {
        this.name = name;
        this.price = price;
        this.expiryDate = expiryDate;
        this.quantity = quantity;
    }

    // Encapsulated price calculation
    private double applyDiscount(double total) {
        if (total > 1000) {
            return total - (total * 0.10); // 10% discount
        }
        return total;
    }

    protected double calculateTotalPrice(int qty) {
        double total = price * qty;
        return applyDiscount(total);
    }

    @Override
    public void sell(int qty) {
        if (checkExpiry()) {
            System.out.println(name + " is expired. Cannot sell.");
            return;
        }

        if (qty > quantity) {
            System.out.println("Insufficient stock for " + name);
            return;
        }

        quantity -= qty; // stock adjustment
        double bill = calculateTotalPrice(qty);

        System.out.println("Sold " + qty + " units of " + name);
        System.out.println("Total Bill: ₹" + bill);
        System.out.println("Remaining Stock: " + quantity);
    }

    protected int getQuantity() {
        return quantity;
    }
}
