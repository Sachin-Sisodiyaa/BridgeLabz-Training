package com.collections.scenario.insurancepolicymanagementsystem;

import java.time.LocalDate;

public class PerformanceTest {

    public static void main(String[] args) {

        PolicyManager manager = new PolicyManager();

        Policy p1 = new Policy("P101", "Sachin",
                LocalDate.now().plusDays(10), "Health", 5000);
        Policy p2 = new Policy("P102", "Rudra",
                LocalDate.now().plusDays(40), "Auto", 8000);

        long start, end;

        // HashSet
        start = System.nanoTime();
        manager.hashSet.add(p1);
        manager.hashSet.contains(p1);
        manager.hashSet.remove(p1);
        end = System.nanoTime();
        System.out.println("HashSet Time: " + (end - start));

        // LinkedHashSet
        start = System.nanoTime();
        manager.linkedHashSet.add(p2);
        manager.linkedHashSet.contains(p2);
        manager.linkedHashSet.remove(p2);
        end = System.nanoTime();
        System.out.println("LinkedHashSet Time: " + (end - start));

        // TreeSet
        start = System.nanoTime();
        manager.treeSet.add(p1);
        manager.treeSet.contains(p1);
        manager.treeSet.remove(p1);
        end = System.nanoTime();
        System.out.println("TreeSet Time: " + (end - start));
    }
}
