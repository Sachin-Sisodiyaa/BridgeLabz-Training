package com.collections.scenario.insurancepolicymanagementsystem2;

import java.time.LocalDate;
import java.util.*;

public class InsurancePolicyManager {

    // 1. Store policies
    private HashMap<String, Policy> hashMap = new HashMap<>();
    private LinkedHashMap<String, Policy> linkedHashMap = new LinkedHashMap<>();
    private TreeMap<LocalDate, List<Policy>> treeMap = new TreeMap<>();

    // Add policy
    public void addPolicy(Policy policy) {
        hashMap.put(policy.policyNumber, policy);
        linkedHashMap.put(policy.policyNumber, policy);

        treeMap.computeIfAbsent(policy.expiryDate, k -> new ArrayList<>())
               .add(policy);
    }

    // Retrieve by policy number
    public Policy getPolicyByNumber(String policyNumber) {
        return hashMap.get(policyNumber);
    }

    // Policies expiring within next 30 days
    public void getPoliciesExpiringSoon() {
        LocalDate today = LocalDate.now();
        LocalDate next30Days = today.plusDays(30);

        System.out.println("\nPolicies Expiring Within 30 Days:");
        for (Map.Entry<LocalDate, List<Policy>> entry : treeMap.entrySet()) {
            if (!entry.getKey().isAfter(next30Days)) {
                for (Policy p : entry.getValue()) {
                    System.out.println(p);
                }
            }
        }
    }

    // Policies for a specific policyholder
    public void getPoliciesByHolder(String holderName) {
        System.out.println("\nPolicies for " + holderName + ":");
        for (Policy p : hashMap.values()) {
            if (p.policyHolderName.equalsIgnoreCase(holderName)) {
                System.out.println(p);
            }
        }
    }

    // Remove expired policies
    public void removeExpiredPolicies() {
        LocalDate today = LocalDate.now();

        Iterator<Map.Entry<String, Policy>> iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Policy p = iterator.next().getValue();
            if (p.expiryDate.isBefore(today)) {
                iterator.remove();
                linkedHashMap.remove(p.policyNumber);
            }
        }

        treeMap.headMap(today).clear();
    }

    // Display policies in insertion order
    public void displayInsertionOrder() {
        System.out.println("\nPolicies in Insertion Order:");
        for (Policy p : linkedHashMap.values()) {
            System.out.println(p);
        }
    }
}
