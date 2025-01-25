package com.tit.week02.day05.hierarchicalinheritance.bankaccount;

class SavingsAccount extends BankAccount {
    private double interestRate;

    // Constructor
    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    // Getter for interest rate
    public double getInterestRate() {
        return interestRate;
    }

    // Method to calculate interest
    public double calculateInterest() {
        return balance * (interestRate / 100);
    }

    // Override to display account type
    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Savings Account");
    }
}