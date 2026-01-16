package com.dayfive.cinemahouse;

import java.time.LocalTime;

public class BubbleSort {

    public static void sort(MovieTime[] movieTime) {
        int n = movieTime.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {

                if (movieTime[j].time.isAfter(movieTime[j + 1].time)) {
                    MovieTime temp = movieTime[j];
                    movieTime[j] = movieTime[j + 1];
                    movieTime[j + 1] = temp;
                }
            }
        }
    }
}
