//import scanner class
import java.util.Scanner;

class BankAccount{
    //Attribute
    private String accountHolderName;
    private final long accountNumber;
    private double balance;
    static private String bankName;
    static private int totalAccount;

    //static block to initialize static values
    static {
        bankName = "Bank of Hindustan";
        totalAccount = 0;
    }
    //constructer to initialze variables
    public BankAccount(String accountHolderName, long accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccount++;
    }
    //static method to get the total number of accounts.
    public static void getTotalAccount() {
        System.out.println("Total number of account - "+ totalAccount);
    }
    //method to display details
    public void displayDitails(){
        System.out.println("Bank name - " + bankName +
                "\nAccount number - " + accountNumber +
                "\nAccount HolderName - " + accountHolderName +
                "\nBalance - " + balance);
    }
}
class Bank {
    //main method
    public static void main(String[] args) {
        //create object of scanner class
        Scanner input = new Scanner(System.in);

        //get input
        System.out.println("Account 1-");
        System.out.println("Enter account holder name - ");
        String accountHolderName1 = input.nextLine();
        System.out.println("Enter account account - ");
        long accountNumber1 = input.nextLong();
        input.nextLine();
        System.out.println("Enter balance - ");
        double balance1 = input.nextDouble();
        input.nextLine();

        System.out.println("Account 2-");
        System.out.println("Enter account holder name - ");
        String accountHolderName2 = input.nextLine();
        System.out.println("Enter account account - ");
        long accountNumber2 = input.nextLong();
        input.nextLine();
        System.out.println("Enter balance - ");
        double balance2 = input.nextDouble();
        input.nextLine();

        //create object of bank account class
        BankAccount account1 = new BankAccount(accountHolderName1, accountNumber1, balance1);
        BankAccount account2 = new BankAccount(accountHolderName2, accountNumber2, balance2);

        //Check if an account object is an instance of the BankAccount
        if(account1 instanceof BankAccount){
            account1.displayDitails();
        }
        if(account2 instanceof BankAccount){
            account2.displayDitails();
        }
        //display total number of account
        BankAccount.getTotalAccount();

        //close scanner object
        input.close();
    }
}
