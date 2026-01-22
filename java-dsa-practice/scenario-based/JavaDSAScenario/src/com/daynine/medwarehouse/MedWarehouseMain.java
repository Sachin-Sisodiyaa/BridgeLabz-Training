/* 10. MedWarehouse – Sorting Medicines by Expiry (Merge Sort)
Story: A pharmaceutical warehouse handles medicine records from multiple branches, each
sending a sorted list by expiry date. To ensure none are wasted, the system uses Merge Sort
to compile all expiry dates and alert if any medicine is nearing expiration.
Concepts Involved:
● Merge Sort
● Sorted sublist merging
● Critical for time-sensitive inventory*/




package com.daynine.medwarehouse;

import java.time.LocalDate;
import java.util.ArrayList;

public class MedWarehouseMain {

    public static void main(String[] args) {

        // Branch 1 (Already Sorted)
        ArrayList<Medicine> branch1 = new ArrayList<>();
        branch1.add(new Medicine("Paracetamol", "B101", LocalDate.of(2026, 1, 10)));
        branch1.add(new Medicine("Cetrizine", "B102", LocalDate.of(2026, 3, 5)));
        branch1.add(new Medicine("Amoxicillin", "B103", LocalDate.of(2026, 6, 15)));

        // Branch 2 (Already Sorted)
        ArrayList<Medicine> branch2 = new ArrayList<>();
        branch2.add(new Medicine("Ibuprofen", "B201", LocalDate.of(2025, 12, 20)));
        branch2.add(new Medicine("Vitamin C", "B202", LocalDate.of(2026, 2, 18)));
        branch2.add(new Medicine("Insulin", "B203", LocalDate.of(2026, 7, 1)));

        // Branch 3 (Already Sorted)
        ArrayList<Medicine> branch3 = new ArrayList<>();
        branch3.add(new Medicine("Aspirin", "B301", LocalDate.of(2025, 11, 25)));
        branch3.add(new Medicine("Antacid", "B302", LocalDate.of(2026, 4, 10)));
        branch3.add(new Medicine("Cough Syrup", "B303", LocalDate.of(2026, 8, 30)));

        // Master list
        ArrayList<Medicine> masterList = new ArrayList<>();
        masterList.addAll(branch1);
        masterList.addAll(branch2);
        masterList.addAll(branch3);

        MergeSort.mergeSort(masterList, 0, masterList.size() - 1);

        System.out.println("Medicine\t\tBatch\t    Expiry Date");
        System.out.println("---------------------------------------");

        for (Medicine m : masterList) {
        	System.out.printf("%-15s %-10s %-15s%n", m.name, m.batchId, m.expiryDate);
        }
    }
}
