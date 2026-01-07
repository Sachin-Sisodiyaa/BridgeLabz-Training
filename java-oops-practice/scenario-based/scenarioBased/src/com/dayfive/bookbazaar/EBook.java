package com.dayfive.bookbazaar;

public class EBook extends Book {

    public EBook(String title, String author, double price, int stock) {
        super(title, author, price, stock);
    }

    // Higher discount for eBooks
    @Override
    public double applyDiscount(double totalPrice) {
        return totalPrice * 0.90; // 10% discount
    }
}
