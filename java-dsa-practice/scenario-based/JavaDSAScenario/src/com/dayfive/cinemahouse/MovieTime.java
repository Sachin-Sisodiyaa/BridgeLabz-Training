package com.dayfive.cinemahouse;

import java.time.LocalTime;

public class MovieTime {

    LocalTime time;

    MovieTime(LocalTime time) {
        this.time = time;
    }
    
    @Override
    public String toString() {
    	return time.toString();
    }
}