

 abstract class LibraryResource {
    private String title;
    private String author;

    public LibraryResource(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public abstract void displayDetails();
}

class Book extends LibraryResource {
    private int pageCount;

    public Book(String title, String author, int pageCount) {
        super(title, author);
        this.pageCount = pageCount;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    @Override
    public void displayDetails() {
        System.out.println("Book Title: " + getTitle() + ", Author: " + getAuthor() + ", Page Count: " + pageCount);
    }
}

class Magazine extends LibraryResource {
    private String issueDate;

    public Magazine(String title, String author, String issueDate) {
        super(title, author);
        this.issueDate = issueDate;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    @Override
    public void displayDetails() {
        System.out.println("Magazine Title: " + getTitle() + ", Author: " + getAuthor() + ", Issue Date: " + issueDate);
    }
}

class DVD extends LibraryResource {
    private double duration;

    public DVD(String title, String author, double duration) {
        super(title, author);
        this.duration = duration;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    @Override
    public void displayDetails() {
        System.out.println("DVD Title: " + getTitle() + ", Author: " + getAuthor() + ", Duration: " + duration);
    }
}

public class Q06 {
    public static void main(String[] args) {
        Book book = new Book("The Alchemist", "Paulo Coelho", 163);
        Magazine magazine = new Magazine("National Geographic", "Various", "May 2024");
        DVD dvd = new DVD("The Shawshank Redemption", "Frank Darabont", 142.0);

        book.displayDetails();
        magazine.displayDetails();
        dvd.displayDetails();
    }
}
