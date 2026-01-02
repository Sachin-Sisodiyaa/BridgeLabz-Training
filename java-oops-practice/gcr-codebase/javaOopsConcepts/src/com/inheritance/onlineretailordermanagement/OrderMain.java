package com.inheritance.onlineretailordermanagement;

public class OrderMain {

    public static void main(String[] args) {

        Order o1 = new Order(101, "2025-01-10");
        Order o2 = new ShippedOrder(102, "2025-01-12", "TRK12345");
        Order o3 = new DeliveredOrder(103, "2025-01-14", "TRK67890", "2025-01-18");

        System.out.println(o1.getOrderStatus());
        System.out.println(o2.getOrderStatus());
        System.out.println(o3.getOrderStatus());
    }
}

