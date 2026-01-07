package com.dayfive.loanbuddy;

public class HomeLoan extends LoanApplication {

    public HomeLoan(Applicant applicant, int term) {
        super(applicant, term, 8.5);
    }

    @Override
    public boolean approveLoan() {
        if (applicant.getCreditScore() >= 700 && applicant.getIncome() >= 30000) {
            updateStatus("APPROVED");
            return true;
        }
        updateStatus("REJECTED");
        return false;
    }

    @Override
    public double calculateEMI() {
        return calculateBaseEMI();
    }
}
