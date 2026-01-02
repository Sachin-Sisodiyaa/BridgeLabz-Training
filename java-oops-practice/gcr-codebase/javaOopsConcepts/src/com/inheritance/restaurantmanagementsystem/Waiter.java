package com.inheritance.restaurantmanagementsystem;

public class Waiter extends Person implements Worker {

    public Waiter(int id, String name) {
        super(id, name);
    }

    @Override
    public void performDuties() {
        System.out.println("Waiter serves food to customers.");
    }
}

