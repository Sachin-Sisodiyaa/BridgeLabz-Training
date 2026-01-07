/*14. "LoanBuddy – Loan Approval Automation"
Story: A fintech startup named FinlyTech is launching a product called LoanBuddy, a web and
mobile app that automates personal loan approvals for salaried and self-employed applicants.
LoanBuddy should collect applicant data, verify eligibility, evaluate credit risk, and either
approve or reject the loan based on custom rules. It also calculates monthly EMIs and provides
a personalized repayment plan.
You’re hired as a Java backend developer to design and implement the core loan approval
engine.
Requirements:
● Applicant class: name, creditScore, income, loanAmount.
● LoanApplication class with loan type, term, and interest rate.
● Interface IApprovable with approveLoan() and calculateEMI().
● Use constructors to support different types of loans (personal, home, auto).
● Operators for EMI calculation: P × R × (1+R)^N / ((1+R)^N – 1)
● Encapsulation: keep credit score and internal approval logic private.
● Inheritance: different loan types (HomeLoan, AutoLoan) extending base class.
● Polymorphism: EMI calculation logic varies by loan type.
● Access modifiers to limit loan status changes to internal processes only.*/



package com.dayfive.loanbuddy;

import java.util.Scanner;

public class LoanBuddyMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Applicant Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Credit Score: ");
        int creditScore = sc.nextInt();

        System.out.print("Enter Monthly Income: ");
        double income = sc.nextDouble();

        System.out.print("Enter Loan Amount: ");
        double loanAmount = sc.nextDouble();

        Applicant applicant = new Applicant(name, creditScore, income, loanAmount);

        System.out.println("Choose Loan Type: 1.Home Loan  2.Auto Loan");
        int choice = sc.nextInt();

        System.out.print("Enter Loan Term (months): ");
        int term = sc.nextInt();

        LoanApplication loan;

        if (choice == 1)
            loan = new HomeLoan(applicant, term);
        else
            loan = new AutoLoan(applicant, term);

        if (loan.approveLoan()) {
            System.out.println("\nLoan Approved!");
            System.out.printf("Monthly EMI: %.2f%n", loan.calculateEMI());
        } else {
            System.out.println("\nLoan Rejected due to eligibility criteria.");
        }

        System.out.println("Loan Status: " + loan.getStatus());
        sc.close();
    }
}
