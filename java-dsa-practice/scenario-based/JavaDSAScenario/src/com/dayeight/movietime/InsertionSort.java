package com.dayeight.movietime;


public class InsertionSort {

    public static void sort(MovieTime[] movieTime, int idx) {
    	MovieTime key = movieTime[idx];
        int j = idx - 1;

        while (j >= 0 && movieTime[j].time.isAfter(key.time)) {
            movieTime[j + 1] = movieTime[j];
            j--;
        }

        movieTime[j + 1] = key;
    }
}
