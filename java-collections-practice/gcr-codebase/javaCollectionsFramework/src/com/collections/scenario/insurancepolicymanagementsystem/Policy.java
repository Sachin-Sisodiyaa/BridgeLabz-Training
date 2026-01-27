package com.collections.scenario.insurancepolicymanagementsystem;

import java.time.LocalDate;
import java.util.Objects;

public class Policy implements Comparable<Policy> {

    String policyNumber;
    String holderName;
    LocalDate expiryDate;
    String coverageType;
    double premium;

    public Policy(String policyNumber, String holderName,
                  LocalDate expiryDate, String coverageType, double premium) {
        this.policyNumber = policyNumber;
        this.holderName = holderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premium = premium;
    }

    // For TreeSet (sorted by expiry date)
    @Override
    public int compareTo(Policy other) {
        return this.expiryDate.compareTo(other.expiryDate);
    }

    // Uniqueness based on policy number
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Policy)) return false;
        Policy policy = (Policy) o;
        return policyNumber.equals(policy.policyNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyNumber);
    }

    @Override
    public String toString() {
        return policyNumber + " | " + holderName + " | " +
               expiryDate + " | " + coverageType + " | ₹" + premium;
    }
}
