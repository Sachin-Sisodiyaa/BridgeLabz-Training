package com.inheritance.restaurantmanagementsystem;

public class Chef extends Person implements Worker {

    public Chef(int id, String name) {
        super(id, name);
    }

    @Override
    public void performDuties() {
        System.out.println("Chef prepares and cooks food.");
    }
}

