package library;

import java.util.HashMap;
import java.util.Map;

public class Library {
    private Map<String, Book> books = new HashMap<>();

    public void addBook(Book book) {
        books.put(book.getTitle(), book);
    }

    public boolean issueBook(String bookTitle) {
        if (books.containsKey(bookTitle)) {
            books.remove(bookTitle);
            return true;
        }
        return false;
    }

    public void returnBook(String bookTitle) {
        // Assuming book details are stored somewhere else.
        books.put(bookTitle, new Book(bookTitle, "Unknown Author"));
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            System.out.println("Available Books:");
            for (Book book : books.values()) {
                System.out.println(" - " + book.getTitle() + " by " + book.getAuthor());
            }
        }
    }
}
