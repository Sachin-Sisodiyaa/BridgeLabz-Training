package com.constructors.levelone;

public class Book {
	
	private String title;
	private String author;
	private float price;
	
	//Default Constructor
	public Book() {
        title  = "WINGS OF FIRE";
        author = "APJ ABDUL KALAM";
        price = 550.0f; 
    }
	
	// Parameterized Constructor
    public Book(String title, String author, float price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    
    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public float getPrice() {
        return price;
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(float price) {
        this.price = price;
    }

}
