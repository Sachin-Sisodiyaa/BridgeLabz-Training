package com.objectmodeling;

import java.util.ArrayList;

public class Order {
    private int orderId;
    private ArrayList<Product> products;

    public Order(int orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void showOrderDetails() {
        System.out.println("Order ID: " + orderId);
        double total = 0;

        for (Product p : products) {
            System.out.println("- " + p.getProductName() + " : ₹" + p.getPrice());
            total += p.getPrice();
        }

        System.out.println("Total Amount: ₹" + total);
    }
}

