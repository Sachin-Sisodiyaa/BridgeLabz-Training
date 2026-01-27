package com.collections.scenario.insurancepolicymanagementsystem2;

import java.time.LocalDate;

public class Policy {

    String policyNumber;
    String policyHolderName;
    LocalDate expiryDate;
    String coverageType;
    double premium;

    public Policy(String policyNumber, String policyHolderName,
                  LocalDate expiryDate, String coverageType, double premium) {
        this.policyNumber = policyNumber;
        this.policyHolderName = policyHolderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premium = premium;
    }

    @Override
    public String toString() {
        return policyNumber + " | " + policyHolderName + " | " +
               coverageType + " | " + expiryDate + " | ₹" + premium;
    }
}
