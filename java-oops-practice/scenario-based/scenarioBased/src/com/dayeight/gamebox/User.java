package com.dayeight.gamebox;

import java.util.ArrayList;

public class User {

    private String name;
    private ArrayList<Game> ownedGames = new ArrayList<>();

    public User(String name) {
        this.name = name;
    }

    public void addGame(Game game) {
        ownedGames.add(game);
        System.out.println(game.getTitle() + " added to library.");
    }

    public void showLibrary() {
        System.out.println("\n" + name + "'s Game Library:");
        for (Game g : ownedGames) {
            g.showDetails();
            System.out.println("------------------");
        }
    }
}

