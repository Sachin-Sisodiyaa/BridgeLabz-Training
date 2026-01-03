package com.encapsulation.librarymanagementsystem;

abstract class LibraryItem {

    // Encapsulated fields
    private int itemId;
    private String title;
    private String author;

    // Sensitive data (secured)
    private String borrowerName;
    private boolean available = true;

    // Constructor
    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // Getters 
    public int getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    // Protected helpers for subclasses only
    protected boolean isAvailable() {
        return available;
    }

    protected void setBorrower(String borrowerName) {
        this.borrowerName = borrowerName;
        this.available = false;
    }

    // Abstract method
    abstract int getLoanDuration();

    // Concrete method
    public void getItemDetails() {
        System.out.println("Item ID   : " + itemId);
        System.out.println("Title     : " + title);
        System.out.println("Author    : " + author);
        System.out.println("Available : " + (available ? "Yes" : "No"));
    }
}
