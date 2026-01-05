package com.daythree.swiftcart;
class PerishableProduct extends Product {

    public PerishableProduct(String name, double price) {
        super(name, price, "Perishable");
    }

    @Override
    public double getDiscount(double amount) {
        return amount * 0.10;   // 10% discount
    }
}
