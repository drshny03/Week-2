package com.tit.week02.day05.hierarchicalinheritance.bankaccount;

public class BankAccountMain {
    public static void main(String[] args) {
        // Create SavingsAccount
        SavingsAccount savings = new SavingsAccount("9529", 5000.0, 3.5);
        savings.displayAccountType();
        System.out.println("Account Number: " + savings.getAccountNumber());
        System.out.println("Balance: INR " + savings.getBalance());
        System.out.println("Interest Earned: INR " + savings.calculateInterest());
        savings.deposit(1000.0);

        System.out.println("\n");

        // Create CheckingAccount
        CheckingAccount checking = new CheckingAccount("74108520", 2000.0, 500.0);
        checking.displayAccountType();
        System.out.println("Account Number: " + checking.getAccountNumber());
        System.out.println("Balance: INR " + checking.getBalance());
        checking.withdraw(300.0);
        checking.withdraw(600.0);

        System.out.println("\n");

        // Create FixedDepositAccount
        FixedDepositAccount fixedDeposit = new FixedDepositAccount("963852", 10000.0, 12, 12000.0);
        fixedDeposit.displayAccountType();
        System.out.println("Account Number: " + fixedDeposit.getAccountNumber());
        System.out.println("Balance: INR " + fixedDeposit.getBalance());
        System.out.println("Maturity Period: " + fixedDeposit.getMaturityPeriod() + " months");
        System.out.println("Maturity Amount: INR " + fixedDeposit.getMaturityAmount());
    }
}
