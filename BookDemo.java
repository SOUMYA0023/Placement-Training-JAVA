class Book {
    // Private fields
    private String title;
    private String author;
    private boolean available;
    
    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.available = true; 
        // By default, a new book is available
    }
    
    // Getter methods
    public String getTitle() {
        return title;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public boolean isAvailable() {
        return available;
    }
    
    // Setter methods
    public void setTitle(String title) {
        this.title = title;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
    
    public void setAvailable(boolean available) {
        this.available = available;
    }
    
    // Method to borrow a book
    public void borrowBook() {
        if (available) {
            available = false;
            System.out.println("Book '" + title + "' borrowed successfully.");
        } else {
            System.out.println("Book '" + title + "' is not available for borrowing.");
        }
    }
    
    // Method to return a book
    public void returnBook() {
        if (!available) {
            available = true;
            System.out.println("Book '" + title + "' returned successfully.");
        } else {
            System.out.println("Book '" + title + "' is already available.");
        }
    }
}

public class BookDemo {
    public static void main(String[] args) {
        // Create a new book
        Book book = new Book("Java Programming", "John Doe");
        
        // Display initial book information
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Available: " + book.isAvailable());
        
        // Borrow the book
        book.borrowBook();
        
        // Try to borrow again
        book.borrowBook();
        
        // Return the book
        book.returnBook();
        
        // Try to return again
        book.returnBook();
    }
}