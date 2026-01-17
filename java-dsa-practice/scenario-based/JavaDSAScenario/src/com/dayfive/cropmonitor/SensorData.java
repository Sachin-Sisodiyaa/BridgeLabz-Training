package com.dayfive.cropmonitor;

import java.time.LocalTime;

class SensorData {
    LocalTime time;
    float temperature;

    SensorData(LocalTime time, float temperature) {
        this.time = time;
        this.temperature = temperature;
    }
}
