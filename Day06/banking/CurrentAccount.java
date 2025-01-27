package com.tit.banking;

// CurrentAccount class
class CurrentAccount extends BankAccount implements Loanable {
    private static final double INTEREST_RATE = 0.02; // 2% annual interest rate

    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE;
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Current Account Loan applied for: " + amount);
    }

    @Override
    public double calculateLoanEligibility() {
        return getBalance() * 2; // Loan eligibility is 2 times the balance
    }
}