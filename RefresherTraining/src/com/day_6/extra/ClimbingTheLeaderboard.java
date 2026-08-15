package com.day_6.extra;

import java.util.*;

public class ClimbingTheLeaderboard {

    public static List<Integer> climbingLeaderboard(
            List<Integer> ranked,
            List<Integer> player) {

        List<Integer> unique = new ArrayList<>();

        for (int score : ranked) {
            if (unique.isEmpty() ||
                unique.get(unique.size() - 1) != score) {

                unique.add(score);
            }
        }

        List<Integer> result = new ArrayList<>();

        for (int score : player) {

            int low = 0;
            int high = unique.size() - 1;

            while (low <= high) {

                int mid = low + (high - low) / 2;

                if (unique.get(mid) == score) {
                    low = mid;
                    break;
                }
                else if (unique.get(mid) < score) {
                    high = mid - 1;
                }
                else {
                    low = mid + 1;
                }
            }

            result.add(low + 1);
        }

        return result;
    }

    public static void main(String[] args) {

        List<Integer> ranked =
                Arrays.asList(100, 100, 50, 40, 40, 20, 10);

        List<Integer> player =
                Arrays.asList(5, 25, 50, 120);

        List<Integer> result =
                climbingLeaderboard(ranked, player);

        System.out.println(result);
    }
}