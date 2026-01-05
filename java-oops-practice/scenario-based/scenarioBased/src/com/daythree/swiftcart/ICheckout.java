package com.daythree.swiftcart;

interface ICheckout {

    double applyDiscount(double total);

    void generateBill();
}
