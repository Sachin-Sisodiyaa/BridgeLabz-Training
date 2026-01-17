package com.dayfive.cropmonitor;

public class QuickSort {

    public static void sort(SensorData[] data, int si, int ei) {
        if (si < ei) {
            int pivotIndex = partition(data, si, ei);

            sort(data, si, pivotIndex - 1);   
            sort(data, pivotIndex + 1, ei);  
        }
    }

    private static int partition(SensorData[] data, int si, int ei) {
     
        SensorData pivot = data[ei];
        int i = si - 1;

        for (int j = si; j < ei; j++) {

            if (data[j].time.isBefore(pivot.time)) {
                i++;

                SensorData temp = data[i];
                data[i] = data[j];
                data[j] = temp;
            }
        }

        i++;
        SensorData temp = pivot;
        data[ei] = data[i];
        data[i] = temp;

        return i; 
    }
}
