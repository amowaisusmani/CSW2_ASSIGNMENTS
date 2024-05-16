import java.util.HashMap;
class Book {
    private int id;
    private String name;
    private String author;
    private int quantity;

    // Parameterized constructor
    public Book(int id, String name, String author, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}

class Library {
    private HashMap<Integer, Book> books;

    public Library() {
        books = new HashMap<>();
    }

    public void addBook(int id, Book book) {
        books.put(id, book);
    }

    public void displayBooks() {
        for (Integer id : books.keySet()) {
            System.out.println("Key: " + id + ", Value: " + books.get(id));
        }
    }

    public boolean isBookPresent(String name) {
        return books.values().stream().anyMatch(book -> book.getName().equals(name));
    }

    public void removeBook(int id) {
        books.remove(id);
    }
}

public class Q05 {
    public static void main(String[] args) {
        // Create Book objects
        Book book1 = new Book(1, "Alice in Wonderland", "Lewis Carroll", 5);
        Book book2 = new Book(2, "Moby Dick", "Herman Melville", 3);

        // Create Library object
        Library library = new Library();

        // Add books to the library
        library.addBook(1, book1);
        library.addBook(2, book2);

        // Display the collection of books in the library
        library.displayBooks();

        // Check if a particular book name is present in the library
        System.out.println("Is 'Moby Dick' present in the library? " + library.isBookPresent("Moby Dick"));

        // Remove the book entry associated with a particular key value
        library.removeBook(1);
        System.out.println("After removing book with id 1:");
        library.displayBooks();
    }
}
