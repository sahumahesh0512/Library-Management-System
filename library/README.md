
# **Library Management System**

This is a simple **Library Management System** project implemented in Java, which demonstrates the core principles of **Object-Oriented Programming (OOP)**:  
- **Abstraction**  
- **Inheritance**  
- **Encapsulation**  
- **Polymorphism**  

The project also showcases the use of **interfaces** and **composition** in Java.  

---

## **Directory Structure**

```
Library-Management-System/
│
├── library/
│       ├── User.java                // Abstract base class for User
│       ├── Admin.java               // Admin class extending User
│       ├── Member.java              // Member class extending User and implementing LibraryOperations
│       ├── LibraryOperations.java   // Interface for library operations
│       ├── Book.java                // Book class to hold book details
│       ├── Library.java             // Library class to manage books
│       └── LibrarySystem.java       // Main class to run the application
└── README.md                        // Project documentation
```

---

## **Source Code Explanation**

### **1. User.java**
- Abstract base class for all users in the system (`Admin` and `Member`).  
- Contains common properties: `name` and `email`, with getter methods for encapsulation.  
- Declares the abstract method `displayInfo()` to enforce implementation in subclasses.

---

### **2. Admin.java**
- `Admin` extends `User` and implements the `displayInfo()` method.  
- Admins can add books to the library by interacting with the `Library` class.  

---

### **3. Member.java**
- `Member` extends `User` and implements the `LibraryOperations` interface.  
- Members can issue and return books.  
- Uses `displayInfo()` to show member details.  

---

### **4. LibraryOperations.java**
- An interface defining the methods `issueBook()` and `returnBook()`.  
- Enforced implementation by the `Member` class.  

---

### **5. Book.java**
- A simple class representing a book with fields: `title` and `author`.  
- Demonstrates encapsulation by using private fields and public getter methods.

---

### **6. Library.java**
- Manages a collection of books using a `HashMap`.  
- Provides methods to add, issue, return, and display books.  
- Demonstrates composition by interacting with `Admin` and `Member`.

---

### **7. LibrarySystem.java**
- The main class to run the project.  
- Demonstrates:
  - Admin adding books to the library.
  - Member issuing and returning books.
  - Library displaying available books.

---

## **How to Run the Project**

### **1. Prerequisites**
- **Java Development Kit (JDK)** installed (Java 8 or higher).  
- A Java IDE or terminal with a text editor.  

---

### **2. Setting Up the Project**
1. Clone or download the repository.
   ```bash
   git clone https://github.com/your-repo/LibraryManagement.git
   cd Library-Management-System
   ```
2. Navigate to the `src` directory and ensure all Java files are in the `library` package.

---

### **3. Compile the Project**
Run the following command to compile all Java files:
```bash
javac -d . src/library/*.java
```
- The `-d` flag creates the package structure (`library`).

---

### **4. Run the Project**
Run the main class to start the application:
```bash
java library.LibrarySystem
```

---

## **Expected Output**

### Sample Output:
```
Admin Name: Alice
Admin Email: alice@library.com
Book 'Java Programming' added by Admin.
Book 'Data Structures' added by Admin.

Available Books:
 - Java Programming by John Doe
 - Data Structures by Jane Smith

Member Name: Bob
Member Email: bob@library.com
Book 'Java Programming' issued successfully.
Book 'Python Basics' is not available.

Available Books:
 - Data Structures by Jane Smith

Book 'Java Programming' returned successfully.
Available Books:
 - Data Structures by Jane Smith
 - Java Programming by Unknown Author
```

---

## **Enhancements**
You can expand the project by adding:
- A login system for users.  
- Persistent storage using files or databases.  
- Exception handling for better error management.  
- Features like book reservation, fines, etc.

---

## **OOP Concepts Used**

1. **Abstraction**:  
   - Abstract class `User` provides a common structure for `Admin` and `Member`.  
2. **Inheritance**:  
   - `Admin` and `Member` extend the `User` class.  
3. **Polymorphism**:  
   - Overridden `displayInfo()` method in `Admin` and `Member`.  
4. **Encapsulation**:  
   - Private fields in classes like `Book` and `User`, with public getter methods.  
5. **Interfaces**:  
   - `LibraryOperations` interface for consistent library operations.  
6. **Composition**:  
   - `Admin` and `Member` interact with `Library`.

---

## **Author**
[Your Name]  
[Your Email]  

Feel free to fork this project and contribute!
