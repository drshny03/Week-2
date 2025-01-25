package com.tit.week02.day05.hierarchicalinheritance.bankaccount;

class CheckingAccount extends BankAccount {
    private double withdrawalLimit;

    // Constructor
    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    // Getter for withdrawal limit
    public double getWithdrawalLimit() {
        return withdrawalLimit;
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= withdrawalLimit && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: INR " + amount + ". Remaining Balance: INR " + balance);
        } else {
            System.out.println("Withdrawal amount exceeds limit or insufficient balance.");
        }
    }

    // Override to display account type
    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Checking Account");
    }
}