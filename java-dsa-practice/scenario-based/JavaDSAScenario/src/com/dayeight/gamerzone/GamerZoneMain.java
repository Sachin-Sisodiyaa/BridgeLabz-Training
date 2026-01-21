/*8. GamerZone – High Score Ranking System (Quick Sort)
Story: A global multiplayer game needs to rank thousands of players in real-time based on their
scores after every match. The list is dynamic, large, and often unsorted. Quick Sort is used to
reorder players quickly for leaderboards.
Concepts Involved:
● Quick Sort
● Sorting dynamic, large datasets
● Performance-driven solution*/




package com.dayeight.gamerzone;

import java.util.Scanner;

public class GamerZoneMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of players: ");
        int n = sc.nextInt();
        sc.nextLine();

        Player[] players = new Player[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nPlayer " + (i + 1));

            System.out.print("Enter Player Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Score: ");
            int score = sc.nextInt();
            sc.nextLine();

            players[i] = new Player(name, score);
        }

        QuickSort.quickSort(players, 0, players.length - 1);

        System.out.println("\nLeaderboard");
        System.out.println("Rank\tName\t\tScore");
        System.out.println("--------------------------------");

        for (int i = 0; i < players.length; i++) {
            System.out.println((i + 1) + "\t" + players[i].name + "\t\t" + players[i].score);
        }

        sc.close();
    }
}
