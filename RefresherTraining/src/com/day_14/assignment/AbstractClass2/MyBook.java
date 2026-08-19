package com.day_14.assignment.AbstractClass2;

class MyBook extends Book {

    MyBook(String title, String author, int price) {
        super(title, author, price);
    }

    @Override
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}