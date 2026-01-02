package com.inheritance.restaurantmanagementsystem;

public class RestaurantMain {

    public static void main(String[] args) {

        Worker w1 = new Chef(101, "Ramesh");
        Worker w2 = new Waiter(102, "Suresh");

        System.out.println("----- Chef Details -----");
        ((Person) w1).displayPersonInfo();
        w1.performDuties();

        System.out.println("\n----- Waiter Details -----");
        ((Person) w2).displayPersonInfo();
        w2.performDuties();
    }
}

