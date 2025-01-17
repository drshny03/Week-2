import java.util.Scanner; // Importing Scanner class for taking user input

// Class representing a Book
public class Book {
    
    // Instance variables to store book details
    String title, author; 
    double price; 

    // Constructor to initialize Book object with title, author, and price
    Book(String title, String author, double price) {
        this.title = title; // Assigning title to the object
        this.author = author; // Assigning author to the object
        this.price = price; // Assigning price to the object
    }

    // Method to display the details of the book
    public void display() {
        System.out.println("Book Name: " + title + 
                           "\nAuthor: " + author + 
                           "\nPrice: " + price); // Printing book details
    }
}

// Main class to test the Book class
class BookMain {
    public static void main(String ar[]) {
        Scanner input = new Scanner(System.in); // Creating Scanner object for user input
        
        // Prompting user to enter book details
        System.out.println("Enter Book Title");
        String title = input.next(); // Reading book title
        
        System.out.println("Enter Author Name");
        String author = input.next(); // Reading author name
        
        System.out.println("Enter Book Price");
        double price = input.nextDouble(); // Reading book price
        
        // Creating a Book object with user-provided details
        Book book = new Book(title, author, price);

        // Displaying the book details
        book.display();
        
        input.close(); // Closing the Scanner object
    }
}
