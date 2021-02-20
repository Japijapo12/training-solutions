package filescanner.library;

public class Book {

    private String catalogNumber;
    private String author;
    private String title;
    private int year;

    public Book(String catalogNumber, String author, String title, int year) {
        this.catalogNumber = catalogNumber;
        this.author = author;
        this.title = title;
        this.year = year;
    }

    public String getCatalogNumber() {
        return catalogNumber;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }
}
