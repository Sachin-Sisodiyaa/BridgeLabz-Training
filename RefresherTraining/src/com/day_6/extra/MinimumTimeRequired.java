package com.day_6.extra;

import java.util.*;

public class MinimumTimeRequired {

    public static long minTime(List<Long> machines, long goal) {

        long minMachine = Collections.min(machines);

        long low = 1;

        long high = minMachine * goal;

        long answer = high;

        while (low <= high) {

            long mid = low + (high - low) / 2;

            long totalItems = 0;

            for (long machine : machines) {
                totalItems += mid / machine;

                if (totalItems >= goal) {
                    break;
                }
            }

            if (totalItems >= goal) {

                answer = mid;

                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        List<Long> machines =
                Arrays.asList(2L, 3L, 2L);

        long goal = 10;

        long result = minTime(machines, goal);

        System.out.println("Minimum days = " + result);
    }
}
