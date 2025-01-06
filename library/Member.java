package library;

public class Member extends User implements LibraryOperations {
    public Member(String name, String email) {
        super(name, email);
    }

    @Override
    public void displayInfo() {
        System.out.println("Member Name: " + getName());
        System.out.println("Member Email: " + getEmail());
    }

    @Override
    public void issueBook(Library library, String bookTitle) {
        if (library.issueBook(bookTitle)) {
            System.out.println("Book '" + bookTitle + "' issued successfully.");
        } else {
            System.out.println("Book '" + bookTitle + "' is not available.");
        }
    }

    @Override
    public void returnBook(Library library, String bookTitle) {
        library.returnBook(bookTitle);
        System.out.println("Book '" + bookTitle + "' returned successfully.");
    }
}
