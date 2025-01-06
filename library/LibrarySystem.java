package library;

public class LibrarySystem {
    public static void main(String[] args) {
        Library library = new Library();

        Admin admin = new Admin("Alice", "alice@library.com");
        admin.displayInfo();
        admin.addBook(library, new Book("Java Programming", "John Doe"));
        admin.addBook(library, new Book("Data Structures", "Jane Smith"));

        System.out.println();

        library.displayBooks();

        System.out.println();

        Member member = new Member("Bob", "bob@library.com");
        member.displayInfo();
        member.issueBook(library, "Java Programming");
        member.issueBook(library, "Python Basics");

        System.out.println();

        library.displayBooks();

        System.out.println();

        member.returnBook(library, "Java Programming");
        library.displayBooks();
    }
}
