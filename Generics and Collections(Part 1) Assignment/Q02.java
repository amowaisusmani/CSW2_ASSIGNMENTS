class Book {
    private int bookId;
    private String bookName;
    private double price;

    // Constructor
    public Book(int bookId, String bookName, double price) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.price = price;
    }

    // Getters
    public int getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public double getPrice() {
        return price;
    }

    // Overriding toString method
    @Override
    public String toString() {
        return "Book ID: " + bookId + ", Book Name: " + bookName + ", Price: " + price;
    }

    // Overriding equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Book book = (Book) obj;
        return Double.compare(book.price, price) == 0;
    }
}

public class Q02 {
    public static void main(String[] args) {
        Book book1 = new Book(1, "Book One", 500.0);
        Book book2 = new Book(2, "Book Two", 600.0);

        System.out.println(book1);
        System.out.println(book2);

        if (book1.equals(book2)) {
            System.out.println("The books are equal in price.");
        } else {
            System.out.println("The books are not equal in price.");
        }
    }
}
