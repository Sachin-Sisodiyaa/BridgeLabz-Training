package com.dayfive.bookbazaar;

public abstract class Book implements IDiscountable {

    private String title;
    private String author;
    protected double price;
    private int stock; // inventory protected via methods only

    public Book(String title, String author, double price, int stock) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.stock = stock;
    }

    // Encapsulation: stock update only via methods
    public boolean reduceStock(int quantity) {
        if (quantity <= stock) {
            stock -= quantity;
            return true;
        }
        return false;
    }

    public int getStock() {
        return stock;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }
}
