package com.collections.scenario.insurancepolicymanagementsystem;

import java.time.LocalDate;
import java.util.*;

public class PolicyManager {

    Set<Policy> hashSet = new HashSet<>();
    Set<Policy> linkedHashSet = new LinkedHashSet<>();
    Set<Policy> treeSet = new TreeSet<>();

    // Add policy to all sets
    public void addPolicy(Policy p) {
        hashSet.add(p);
        linkedHashSet.add(p);
        treeSet.add(p);
    }

    // 1️⃣ All Unique Policies
    public void displayAllPolicies() {
        hashSet.forEach(System.out::println);
    }

    // 2️⃣ Policies Expiring in Next 30 Days
    public void policiesExpiringSoon() {
        LocalDate today = LocalDate.now();
        LocalDate limit = today.plusDays(30);

        hashSet.stream()
                .filter(p -> !p.expiryDate.isAfter(limit))
                .forEach(System.out::println);
    }

    // 3️⃣ Policies by Coverage Type
    public void policiesByCoverage(String type) {
        hashSet.stream()
                .filter(p -> p.coverageType.equalsIgnoreCase(type))
                .forEach(System.out::println);
    }

    // 4️⃣ Detect Duplicate Policy Numbers
    public void findDuplicates(List<Policy> list) {
        Set<String> seen = new HashSet<>();
        list.stream()
                .filter(p -> !seen.add(p.policyNumber))
                .forEach(System.out::println);
    }
}
