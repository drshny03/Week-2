// Base BankAccount class
class BankAccount {
    public String accountNumber;    // accountNumber is public
    protected String accountHolder; // accountHolder is protected
    private double balance;         // balance is private

    // Constructor to initialize account details
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Public method to access the balance
    public double getBalance() {
        return balance;
    }

    // Public method to modify the balance
    public void setBalance(double balance) {
        if (balance >= 0) { // Ensure the balance is not negative
            this.balance = balance;
        } else {
            System.out.println("Invalid balance. Balance cannot be negative.");
        }
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: INR " + balance);
    }
}

// Subclass SavingsAccount
class SavingsAccount extends BankAccount {

    // Constructor for SavingsAccount
    public SavingsAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    // Method to display specific details for SavingsAccount
    public void displaySavingsAccountDetails() {
        
        System.out.println("Account Number: " + accountNumber); // Accessing the public accountNumber
        System.out.println("Account Holder: " + accountHolder); // Accessing the protected accountHolder
    }
}

// Main class with the main method
public class BankAccountMain {
    public static void main(String[] args) {
        // Create a BankAccount object
        BankAccount bankAccount = new BankAccount("123456789", "Darshan", 1000000);
        System.out.println("Bank Account Details:");
        bankAccount.displayAccountDetails();

        // Modify balance using the setter method
        System.out.println("\nUpdating Balance:");
        bankAccount.setBalance(1200.0);
        bankAccount.displayAccountDetails();

        // Create a SavingsAccount object
        SavingsAccount savingsAccount = new SavingsAccount("987654321", "Nikhil", 50000.0);
        System.out.println("\nSavings Account Details:");
        savingsAccount.displaySavingsAccountDetails();
    }
}
