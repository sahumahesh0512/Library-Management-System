package library;

public class Admin extends User {
    public Admin(String name, String email) {
        super(name, email);
    }

    @Override
    public void displayInfo() {
        System.out.println("Admin Name: " + getName());
        System.out.println("Admin Email: " + getEmail());
    }

    public void addBook(Library library, Book book) {
        library.addBook(book);
        System.out.println("Book '" + book.getTitle() + "' added by Admin.");
    }
}
