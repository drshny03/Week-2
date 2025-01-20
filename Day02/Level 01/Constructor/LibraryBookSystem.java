// Book class definition
 class Book {
    private String title;       // Title of the book
    private String author;      // Author of the book
    private double price;       // Price of the book
    private boolean available;  // Availability status of the book

    // Constructor to initialize book details
    public Book(String title, String author, double price, boolean available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }

    // Method to borrow a book
    public boolean borrowBook() {
        if (available) {
            available = false; // Mark the book as borrowed
            System.out.println("You have successfully borrowed \"" + title + "\".");
            return true;
        } else {
            System.out.println( title + " is currently unavailable.");
            return false;
        }
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: INR" + price);
        System.out.println("Available: " + (available ? "Yes" : "No"));
    }

   
   class LibraryBookSystem
   {
    // Main method to demonstrate the Library Book System
    public static void main(String[] args) {
        // Create a book instance
        Book book1 = new Book("Harry Potter", "J. K. Rowling", 200, true);

        // Display book details
        System.out.println("Book Details:");
        book1.displayDetails();

        // Attempt to borrow the book
        System.out.println("\nAttempting to borrow the book...");
        book1.borrowBook();

        // Display book details after borrowing
        System.out.println("\nBook Details After Borrowing:");
        book1.displayDetails();

        // Attempt to borrow the book again
        System.out.println("\nAttempting to borrow the book again...");
        book1.borrowBook();

    }
    }
}
