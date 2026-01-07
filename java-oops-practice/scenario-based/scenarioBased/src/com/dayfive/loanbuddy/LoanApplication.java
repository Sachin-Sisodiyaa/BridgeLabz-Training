package com.dayfive.loanbuddy;

public abstract class LoanApplication implements IApprovable {

    protected Applicant applicant;
    protected int term;               // months
    protected double interestRate;    // annual
    private String status = "PENDING"; // restricted access

    public LoanApplication(Applicant applicant, int term, double interestRate) {
        this.applicant = applicant;
        this.term = term;
        this.interestRate = interestRate;
    }

    // EMI formula
    protected double calculateBaseEMI() {
        double P = applicant.getLoanAmount();
        double R = interestRate / (12 * 100);
        int N = term;

        return (P * R * Math.pow(1 + R, N)) /
               (Math.pow(1 + R, N) - 1);
    }

    protected void updateStatus(String newStatus) {
        status = newStatus;
    }

    public String getStatus() {
        return status;
    }
}
