package collectionsequalshash;


import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class BookCatalog {

    public Book findBookByTitleAuthor(List<Book> books, String title, String author) {
        Book searchedBook = new Book(title, author);
        if (!books.contains(searchedBook)) {
            return null;
        }
        int index = books.indexOf(searchedBook);
        return books.get(index);
    }

    public Book findBook(List<Book> books, Book book) {
        if (!books.contains(book)) {
            return null;
        }
        int index = books.indexOf(book);
        return books.get(index);
    }



    public Set<Book> addBooksToSet(Book[] books) {
        Set<Book> localBooks = new HashSet<>();
        for (Book book : books) {
            localBooks.add(book);
        }
        return localBooks;
    }
}


//A Book osztály objektumait rakjuk bele List és Set kollekció típusokba. Vizsgáljuk meg,
//hogy mely tesztesetek futnak le sikeresen, és melyek nem - a Book osztályban felülírt, vagy
//éppen kihagyott equals és hashCode metódusok esetén. Értelmezzük a tapasztaltakat!
