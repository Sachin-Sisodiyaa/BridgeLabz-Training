package com.daythree.swiftcart;
class NonPerishableProduct extends Product {

    public NonPerishableProduct(String name, double price) {
        super(name, price, "Non-Perishable");
    }

    @Override
    public double getDiscount(double amount) {
        return amount * 0.05;   // 5% discount
    }
}
