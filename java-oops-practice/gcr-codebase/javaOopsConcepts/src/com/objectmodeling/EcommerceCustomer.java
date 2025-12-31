package com.objectmodeling;

import java.util.ArrayList;

public class EcommerceCustomer {
    private String customerName;
    private ArrayList<Order> orders;

    public EcommerceCustomer(String customerName) {
        this.customerName = customerName;
        this.orders = new ArrayList<>();
    }

    // Communication method
    public void placeOrder(Order order) {
        orders.add(order);
        System.out.println(customerName + " placed Order ID: " + order);
    }

    public void showOrders() {
        System.out.println("Orders placed by " + customerName + ":");
        for (Order o : orders) {
            o.showOrderDetails();
            System.out.println();
        }
    }
}

