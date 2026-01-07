package com.dayfive.loanbuddy;

public class AutoLoan extends LoanApplication {

    public AutoLoan(Applicant applicant, int term) {
        super(applicant, term, 10.5);
    }

    @Override
    public boolean approveLoan() {
        if (applicant.getCreditScore() >= 650 && applicant.getIncome() >= 20000) {
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
