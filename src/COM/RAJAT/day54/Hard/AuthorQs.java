package COM.RAJAT.day54.Hard;

// Author class
class Author {
    private String name;
    private String email;

    // Constructor
    public Author(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Copy constructor for deep copy
    public Author(Author other) {
        this.name = other.name;
        this.email = other.email;
    }

    // Setters and getters
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void display() {
        System.out.println("Author: " + name + ", Email: " + email);
    }
}

// LibraryBook class containing Author
class LibraryBook {
    private String title;
    private Author author;

    // Constructor
    public LibraryBook(String title, Author author) {
        this.title = title;
        this.author = author; // original author object
    }

    // Deep copy constructor
    public LibraryBook(LibraryBook other) {
        this.title = other.title;
        this.author = new Author(other.author); // create a new Author object
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthorName(String name) {
        this.author.setName(name);
    }

    public void display() {
        System.out.println("Book Title: " + title);
        author.display();
    }
}

// Demonstration
public class AuthorQs {
    public static void main(String[] args) {
        Author author1 = new Author("J.K. Rowling", "jk@example.com");
        LibraryBook book1 = new LibraryBook("Harry Potter", author1);

        // Create a deep copy
        LibraryBook book2 = new LibraryBook(book1);

        // Change original author name
        book1.setAuthorName("New Author Name");

        System.out.println("Original Book:");
        book1.display(); // Shows new author name

        System.out.println("\nCopied Book:");
        book2.display(); // Shows original author name
    }
}