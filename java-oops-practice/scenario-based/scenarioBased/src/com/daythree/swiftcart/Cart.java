package com.daythree.swiftcart;
import java.util.ArrayList;

class Cart implements ICheckout {

    private ArrayList<Product> products;
    private double totalPrice;   // only Cart can modify this

    public Cart() {
        products = new ArrayList<>();
        totalPrice = 0;
    }

    // Add product with quantity
    public void addProduct(Product p, int qty) {
        products.add(p);
        totalPrice += p.getPrice() * qty;   // price * quantity
    }

    @Override
    public double applyDiscount(double coupon) {
        totalPrice = totalPrice - coupon;
        return totalPrice;
    }

    @Override
    public void generateBill() {
        double discount = 0;

        for (Product p : products)
            discount += p.getDiscount(p.getPrice());

        totalPrice -= discount;

        System.out.println("Discount Applied: Rs." + discount);
        System.out.println("Final Amount: Rs." + totalPrice);
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
