package com.dayeight.gamebox;

public class ArcadeGame extends Game {

    public ArcadeGame(String title, double price, double rating) {
        super(title, "Arcade", price, rating);
    }

    @Override
    public void download() {
        System.out.println(getTitle() + " downloaded instantly!");
    }

    @Override
    public void playDemo() {
        System.out.println("Playing fast-paced Arcade demo 🎮");
    }
}

