package com.dayeight.gamebox;

public abstract class Game implements IDownloadable {

    private String title;
    private String genre;
    protected double price;
    private double rating;

    public Game(String title, String genre, double price, double rating) {
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    protected void applySeasonalOffer(double discount) {
        price = price - discount;
    }

    public void showDetails() {
        System.out.println("Game: " + title);
        System.out.println("Genre: " + genre);
        System.out.println("Price: Rs." + price);
        System.out.println("Rating: " + rating);
    }
}

