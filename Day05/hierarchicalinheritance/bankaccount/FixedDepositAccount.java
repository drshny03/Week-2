package com.tit.week02.day05.hierarchicalinheritance.bankaccount;

class FixedDepositAccount extends BankAccount {
    private int maturityPeriod; // in months
    private double maturityAmount;

    // Constructor
    public FixedDepositAccount(String accountNumber, double balance, int maturityPeriod, double maturityAmount) {
        super(accountNumber, balance);
        this.maturityPeriod = maturityPeriod;
        this.maturityAmount = maturityAmount;
    }

    // Getter for maturity period
    public int getMaturityPeriod() {
        return maturityPeriod;
    }

    // Getter for maturity amount
    public double getMaturityAmount() {
        return maturityAmount;
    }

    // Override to display account type
    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
    }
}