/* 8. CropMonitor – Sensor Data Ordering (Quick Sort)
Story: An agri-tech firm uses drone sensors that record soil temperatures at random intervals.
The large data needs to be sorted quickly by timestamp before visualization. Quick Sort is
chosen due to its fast average performance.
Key Concepts:
● Unordered sensor data
● High-speed sorting
● Quick partitioning based on timestamps*/





package com.dayfive.cropmonitor;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class CropMonitorMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Formatter for time input like 10:30 AM
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a", Locale.ENGLISH);

        System.out.print("Enter number of sensor readings: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        SensorData[] data = new SensorData[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nReading " + (i + 1));

            System.out.print("Enter time (hh:mm AM/PM): ");
            String timeInput = sc.nextLine();   

            LocalTime time = LocalTime.parse(timeInput.toUpperCase(), formatter);

            System.out.print("Enter temperature: ");
            float temp = sc.nextFloat();
            sc.nextLine(); 

            data[i] = new SensorData(time, temp);
        }

        // Sort sensor data by time using Quick Sort
        QuickSort.sort(data, 0, data.length - 1);

        System.out.println("\nSorted Sensor Data by Time:");
        for (SensorData s : data) {
            System.out.println(s.time + "  →  " + s.temperature + "°C");
        }

        sc.close();
    }
}
