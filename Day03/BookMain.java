// BookMain class containing the main method
public class BookMain {
    public static void main(String[] args) {
        // Set the library name
        Book.libraryName = "Central Library";

        // Create book objects
        Book book1 = new Book("Harry Potter", "J. K. Rowling", "123456789");
        Book book2 = new Book("Math by R.D. Sharma", "R.D. Sharma", "000012456");

        // Display the library name
        Book.displayLibraryName();

        // Check if the objects are instances of Book and display their details
        if (book1 instanceof Book) {
            book1.displayDetails();
        }

        if (book2 instanceof Book) {
            book2.displayDetails();
        }
    }
}

// Book class to manage library books
class Book {
    // Static variable shared across all books
    static String libraryName;

    // Final variable to ensure the unique identifier of a book cannot be changed
    private final String isbn;

    // Instance variables for title and author
    private String title;
    private String author;

    // Constructor using 'this' to initialize instance variables
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Static method to display the library name
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
       
    }
}
