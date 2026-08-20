package com.day_15.assignment;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Comporator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Player[] player = new Player[n];

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int score = sc.nextInt();

            player[i] = new Player(name, score);
        }

        Checker checker = new Checker();

        Arrays.sort(player, checker);

        for (int i = 0; i < player.length; i++) {
            System.out.println(player[i].name + " " + player[i].score);
        }

        sc.close();
    }
}


class Player {
    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

class Checker implements Comparator<Player> {

    public int compare(Player o1, Player o2) {

        if (o1.score != o2.score) {
            return o2.score - o1.score;
        }

        return o1.name.compareTo(o2.name);
    }
}
