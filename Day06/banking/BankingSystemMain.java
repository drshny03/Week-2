package com.tit.banking;

// Main class
public class BankingSystemMain {
    public static void main(String[] args) {
        BankAccount[] accounts = {
                new SavingsAccount("9529852", "Darshan Yadav", 5000),
                new CurrentAccount("74108520", "Rajveer Kajle", 10000)
        };

        for (BankAccount account : accounts) {
            account.displayDetails();
            double interest = account.calculateInterest();
            System.out.println("Interest Earned: " + interest);

            if (account instanceof Loanable) {
                Loanable loanable = (Loanable) account;
                loanable.applyForLoan(5000);
                System.out.println("Loan Eligibility: " + loanable.calculateLoanEligibility());
            }
            System.out.println();
        }
    }
}