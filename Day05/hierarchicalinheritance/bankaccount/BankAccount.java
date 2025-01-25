package com.tit.week02.day05.hierarchicalinheritance.bankaccount;

abstract class BankAccount {
    private String accountNumber;
    protected double balance;

    // Constructor
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Public getter for account number
    public String getAccountNumber() {
        return accountNumber;
    }

    // Public getter for balance
    public double getBalance() {
        return balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: INR " + amount + ". New Balance: INR " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Abstract method for displaying account type
    public abstract void displayAccountType();
}