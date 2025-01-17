import java.util.Scanner; // Importing Scanner class for user input

// Class representing a Bank Account
public class BankAccount {
    // Attributes to store bank account details
    String accountHolder; 
    String accountNumber;
    long balance;

    // Constructor to initialize the BankAccount object with account holder, account number, and balance
    BankAccount(String accountHolder, String accountNumber, long balance) {
        this.accountHolder = accountHolder; // Assigning account holder name to the object
        this.accountNumber = accountNumber; // Assigning account number to the object
        this.balance = balance; // Assigning initial balance to the object
    }

    // Method to deposit money into the account
    public void depositeAmount(double deposit) {
        balance = balance + (long)deposit; // Updating the balance after deposit
    }

    // Method to withdraw money from the account
    public void withdrawAmount(long withdraw) {
        if (balance < withdraw) {
            // Checking if there are sufficient funds for withdrawal
            System.out.println("Insufficient Balance"); // Display error if balance is insufficient
        } else {
            balance = balance - withdraw; // Deducting the withdrawal amount from the balance
            System.out.println("Money Withdrawn Successfully"); // Display success message
        }
    }

    // Method to display the current balance of the account
    public void display() {
        System.out.println("Balance is: " + balance); // Printing the account balance
    }
}

// Main class to test the BankAccount class
class BankAccountMain {
    public static void main(String ar[]) {
        Scanner input = new Scanner(System.in); // Creating Scanner object for user input

        // Prompting the user to enter account details
        System.out.println("Enter Account Holder Name:");
        String accountHolder = input.next(); // Reading account holder name

        System.out.println("Enter Account Number:");
        String accountNumber = input.next(); // Reading account number

        System.out.println("Enter Initial Balance:");
        long balance = input.nextLong(); // Reading initial balance

        // Creating a BankAccount object with user-provided details
        BankAccount bankAccount = new BankAccount(accountHolder, accountNumber, balance);

        // Prompting the user to deposit money
        System.out.println("Enter Amount to Deposit:");
        double deposit = input.nextDouble(); // Reading deposit amount
        bankAccount.depositeAmount(deposit); // Depositing the amount

        // Prompting the user to withdraw money
        System.out.println("Enter Amount to Withdraw:");
        long withdraw = input.nextLong(); // Reading withdrawal amount
        bankAccount.withdrawAmount(withdraw); // Withdrawing the amount

        // Displaying the final account balance
        bankAccount.display();

        input.close(); // Closing the Scanner object
    }
}
