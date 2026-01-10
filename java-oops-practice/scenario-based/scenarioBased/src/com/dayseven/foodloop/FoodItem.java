package com.dayseven.foodloop;

abstract class FoodItem {

    protected String name;
    protected String category;
    protected double price;
    private int stock; // hidden from user

    // Stock decided by system, not user
    public FoodItem(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.stock = 20; // default stock
    }

    public boolean isAvailable() {
        return stock > 0;
    }

    public void reduceStock() {
        stock--;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
