package library;

public interface LibraryOperations {
    void issueBook(Library library, String bookTitle);
    void returnBook(Library library, String bookTitle);
}
