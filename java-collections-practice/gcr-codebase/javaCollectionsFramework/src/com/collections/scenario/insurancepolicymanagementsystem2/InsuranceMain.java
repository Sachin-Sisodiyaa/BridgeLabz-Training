package com.collections.scenario.insurancepolicymanagementsystem2;

import java.time.LocalDate;

public class InsuranceMain {

    public static void main(String[] args) {

        InsurancePolicyManager manager = new InsurancePolicyManager();

        manager.addPolicy(new Policy("P101", "Sachin",
                LocalDate.now().plusDays(20), "Health", 5000));

        manager.addPolicy(new Policy("P102", "Rudra",
                LocalDate.now().plusDays(60), "Auto", 8000));

        manager.addPolicy(new Policy("P103", "Sachin",
                LocalDate.now().minusDays(5), "Home", 12000));

        manager.displayInsertionOrder();

        System.out.println("\nRetrieve Policy P101:");
        System.out.println(manager.getPolicyByNumber("P101"));

        manager.getPoliciesByHolder("Sachin");

        manager.getPoliciesExpiringSoon();

        manager.removeExpiredPolicies();

        System.out.println("\nAfter Removing Expired Policies:");
        manager.displayInsertionOrder();
    }
}
