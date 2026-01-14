package com.dayeight.gamebox;

public class StrategyGame extends Game {

    public StrategyGame(String title, double price, double rating) {
        super(title, "Strategy", price, rating);
    }

    @Override
    public void download() {
        System.out.println(getTitle() + " downloading with additional assets...");
    }

    @Override
    public void playDemo() {
        System.out.println("Playing Strategy demo tutorial mode");
    }
}

