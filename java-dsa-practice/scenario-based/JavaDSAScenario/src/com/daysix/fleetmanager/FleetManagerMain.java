/* 10. FleetManager – Vehicle Maintenance Scheduler (Merge Sort)
Story: A fleet company schedules vehicle maintenance based on mileage. Each depot sends a
sorted list of vehicles. To create a master schedule, Merge Sort is used to combine these depot
lists efficiently.
Key Concepts:
● Sorted sublists from multiple sources
● Merge sort for final master list
● Efficient memory usage for large lists*/



package com.daysix.fleetmanager;

public class FleetManagerMain {

    public static void main(String[] args) {

        Vehicle[] depot1 = {
            new Vehicle("V101", 12000),
            new Vehicle("V102", 18500),
            new Vehicle("V103", 25000),
            new Vehicle("V104", 31200),
            new Vehicle("V105", 40000)
        };

        Vehicle[] depot2 = {
            new Vehicle("V201", 10000),
            new Vehicle("V202", 22000),
            new Vehicle("V203", 28500),
            new Vehicle("V204", 35000),
            new Vehicle("V205", 45300)
        };

        Vehicle[] depot3 = {
            new Vehicle("V301", 15000),
            new Vehicle("V302", 20500),
            new Vehicle("V303", 27000),
            new Vehicle("V304", 33800),
            new Vehicle("V305", 50000)
        };

        int totalSize = depot1.length + depot2.length + depot3.length;
        Vehicle[] masterSchedule = new Vehicle[totalSize];

        int index = 0;
        for (Vehicle v : depot1) masterSchedule[index++] = v;
        for (Vehicle v : depot2) masterSchedule[index++] = v;
        for (Vehicle v : depot3) masterSchedule[index++] = v;

        MergeSort.sort(masterSchedule, 0, masterSchedule.length - 1);

        System.out.println("Master Vehicle Maintenance Schedule By Mileage: ");
        for (Vehicle v : masterSchedule) {
            System.out.println(v.vehicleId + " → " + v.mileage + " km");
        }
    }
}
