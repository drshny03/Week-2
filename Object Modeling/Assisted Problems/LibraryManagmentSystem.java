//importing necesarry packages
import java.util.ArrayList;
import java.util.List;

//class to demonstrate Book
class Book{
    //Attribute 
    private String title;
    private String author;

    //constucter to initialize Book object
    public Book(String title, String auther) {
        this.title = title;
        this.author = auther;
    }
    //method to display book details
    public void displayBook(){
        System.out.println("\nBook title - " + title +
                "\nBook auther - " + author);
    }

    
}
//class to demonstrate Library
class Library{
    //instance Attribute
    private String libraryName;
    private List<Book> books;

    //constructer to initialize Library
    public Library(String libraryName, List<Book> books) {
        this.libraryName = libraryName;
        this.books = books;
    }

    //method to display all books of library
    public void displayAllBooks(){
        System.out.println("\nAll books available in library "+ libraryName);
        for(Book book : books){
            book.displayBook();
        }
    }
}

//main class
public class LibraryManagmentSystem {
    //main method
    public static void main(String[] args) {
        //create object of book class
        Book book1 = new Book("A Suitable Boy", "Vikram Seth");
        Book book2 = new Book("In Search of Lost Time", "Marcel Proust");
        Book book3 = new Book("The Blue Umbrella", "Ruskin Bond");
        Book book4 = new Book("Alice's Adventures in Wonderland", "Lewis Carroll");

        //creating two arraylist to store all books
        List<Book> bookList1 = new ArrayList<>();
        List<Book> bookList2 = new ArrayList<>();
        //add books to list 1
        bookList1.add(book1);
        bookList1.add(book2);
        //add books to list 1
        bookList2.add(book3);
        bookList2.add(book4);


        //create objects of library 
        Library library1 = new Library("Library 1", bookList1);
        Library library2 = new Library("Library 2", bookList2);
        
        //check of library is a instance of Library class
        if(library1 instanceof Library){
            //call method to display all books in library 1
            library1.displayAllBooks();
        }
        if(library2 instanceof Library){
            //call method to display all books in library 2
            library2.displayAllBooks();
        }
        //to showcase aggregation call a method of book class without library
        System.out.println("\nbook details without library class");
        book1.displayBook();
    }
}