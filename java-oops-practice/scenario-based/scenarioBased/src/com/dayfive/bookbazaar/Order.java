package com.dayfive.bookbazaar;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private int orderId;
    private User user;
    private List<Book> books = new ArrayList<>();
    private double totalCost;
    private String status = "CREATED"; // restricted update

    public Order(int orderId, User user) {
        this.orderId = orderId;
        this.user = user;
    }

    public void addBook(Book book, int quantity) {

        if (book.reduceStock(quantity)) {
            double cost = book.getPrice() * quantity; // operator usage
            cost = book.applyDiscount(cost);           // polymorphism
            totalCost += cost;
            books.add(book);
        } else {
            System.out.println("\nNot enough stock for " + book.getTitle());
        }
    }

    // Restricted order status update
    private void updateStatus(String newStatus) {
        status = newStatus;
    }

    public void placeOrder() {
        updateStatus("PLACED");
    }

    public void displayOrder() {
        System.out.println("\nOrder ID: " + orderId);
        System.out.println("User: " + user.getName());
        System.out.println("Total Cost: Rs." + totalCost);
        System.out.println("Status: " + status);
    }
}
