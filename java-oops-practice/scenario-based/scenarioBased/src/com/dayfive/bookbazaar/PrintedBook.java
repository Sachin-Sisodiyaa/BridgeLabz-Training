package com.dayfive.bookbazaar;

public class PrintedBook extends Book {

    public PrintedBook(String title, String author, double price, int stock) {
        super(title, author, price, stock);
    }

    // Lower discount for printed books
    @Override
    public double applyDiscount(double totalPrice) {
        return totalPrice * 0.95; // 5% discount
    }
}
