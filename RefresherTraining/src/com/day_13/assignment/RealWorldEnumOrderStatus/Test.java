package com.day_13.assignment.RealWorldEnumOrderStatus;

public class Test {

    public static void main(String[] args) {

        OrderStatus status = OrderStatus.PLACED;

        System.out.println("Order Status: " + status);
        System.out.println("Is Final: " + status.isFinal());

        status = OrderStatus.SHIPPED;

        System.out.println("Order Status: " + status);
        System.out.println("Is Final: " + status.isFinal());

        status = OrderStatus.DELIVERED;

        System.out.println("Order Status: " + status);
        System.out.println("Is Final: " + status.isFinal());
        
        status = OrderStatus.CANCELLED;

        System.out.println("Order Status: " + status);
        System.out.println("Is Final: " + status.isFinal());
    }
}