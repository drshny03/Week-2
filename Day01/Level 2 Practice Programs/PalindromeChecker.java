import java.util.Scanner;

class PalindromeChecker {
    String text;

    // Constructor to initialize the text
    PalindromeChecker(String text) {
        this.text = text;
    }

    // Method to check if the text is a palindrome
    public boolean isPalindrome() {
        int start = 0;
        int end = text.length() - 1;

        // Loop to compare characters from both ends
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false; // If characters don't match, it's not a palindrome
            }
            start++;
            end--;
        }
        return true; // If all characters match, it's a palindrome
    }

    // Method to display the result
    public void displayResult() {
        if (isPalindrome()) {
            System.out.println("The text \"" + text + "\" is a palindrome.");
        } else {
            System.out.println("The text \"" + text + "\" is not a palindrome.");
        }
    }
}

class PalindromeMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get user input for the text to check
        System.out.print("Enter text to check if it's a palindrome: ");
        String text = input.nextLine();

        // Create an instance of PalindromeChecker
        PalindromeChecker checker = new PalindromeChecker(text);

        // Display the result
        checker.displayResult();

        input.close();
    }
}
