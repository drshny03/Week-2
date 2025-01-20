// Base Book class
class Book {
    public String ISBN;          // ISBN is public
    protected String title;      // Title is protected
    private String author;       // Author is private

    // Constructor to initialize book details
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Public method to set the author's name
    public void setAuthor(String author) {
        this.author = author;
    }

    // Public method to get the author's name
    public String getAuthor() {
        return author;
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

// Subclass EBook
class EBook extends Book {

    // Constructor for EBook
    public EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    // Method to display details specific to the EBook
    public void displayEBookDetails() {
        System.out.println("EBook Details:");
        System.out.println("ISBN: " + ISBN); // Accessing the public ISBN
        System.out.println("Title: " + title); // Accessing the protected title
    }
}

// Main class with the main method
public class BookLibraryMain {
    public static void main(String[] args) {
        // Create a Book object
        Book book = new Book("954657410", "Java Programming", "Darshan");
        System.out.println("Book Details:");
        book.displayBookDetails();

        // Set a new author using the setter method
        book.setAuthor("Rajveer");
        System.out.println("\nUpdated Book Details:");
        book.displayBookDetails();

        // Create an EBook object
        EBook eBook = new EBook("987456321", "Advanced Java", "Nikhil");
        System.out.println("\nEBook Details:");
        eBook.displayEBookDetails();
    }
}
