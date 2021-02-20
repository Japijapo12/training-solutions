package filescanner.library;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {

    private List<Book> books = new ArrayList<>();;

    public void loadFromFile() {
        try(Scanner scanner = new Scanner(Library.class.getResourceAsStream("/book2.csv"))) {
//resources könyvtárba kell tenni a book2.csv fájlt

            scanner.useDelimiter(";|(\r\n)");
            while(scanner.hasNextLine()) {
                String catalogNumber = scanner.next();
                String author = scanner.next();
                String title = scanner.next();
                int year = scanner.nextInt();
                books.add(new Book(catalogNumber, author, title, year));
            }
        }
    }
    public List<Book> getBooks() {
        return books;
    }
}
