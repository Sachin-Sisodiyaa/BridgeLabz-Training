/*24. "GameBox – Mobile Game Distribution Platform"
Story: GameBox offers mobile games for download and purchase with features like demos,
reviews, and leaderboards.
Requirements:
● Game class: title, genre, price, rating.
● User class with list of owned games.
● Interface IDownloadable: download(), playDemo().
● Constructors to set up free or paid games.
● Use operators to apply seasonal offers.
● Encapsulation: user-owned game data protected.
● Inheritance: ArcadeGame, StrategyGame from Game.
● Polymorphism: playDemo() behaves differently per genre.*/





package com.dayeight.gamebox;

import java.util.Scanner;

public class GameBoxMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter User Name: ");
        String username = sc.nextLine();
        User user = new User(username);

        System.out.println("Choose Game Type:");
        System.out.println("1. Arcade Game");
        System.out.println("2. Strategy Game");
        int choice = sc.nextInt();

        sc.nextLine(); // buffer clear

        System.out.print("Enter Game Title: ");
        String title = sc.nextLine();

        System.out.print("Enter Game Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter Rating: ");
        double rating = sc.nextDouble();

        Game game;

        if (choice == 1) {
            game = new ArcadeGame(title, price, rating);
        } else {
            game = new StrategyGame(title, price, rating);
        }

        System.out.println("\n1. Play Demo");
        System.out.println("2. Download Game");
        int action = sc.nextInt();

        if (action == 1)
            game.playDemo();
        else
            game.download();

        user.addGame(game);
        user.showLibrary();

        sc.close();
    }
}

