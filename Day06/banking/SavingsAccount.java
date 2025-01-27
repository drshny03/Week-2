package com.tit.banking;

// SavingsAccount class
class SavingsAccount extends BankAccount implements Loanable {
    private static final double INTEREST_RATE = 0.04; // 4% annual interest rate

    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE;
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Savings Account Loan applied for: " + amount);
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() * 3; // Loan eligibility is 3 times the balance
    }
}