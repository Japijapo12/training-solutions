package collectionscomp;

import java.text.Collator;
import java.util.*;

public class OrderedLibrary {

    private List<Book> libraryBooks = new LinkedList<>();

    public OrderedLibrary(List<Book> libraryBooks) {
        this.libraryBooks = libraryBooks;
    }

    public List<Book> orderedByTitle() {

        List<Book> orderedList = new ArrayList<>(libraryBooks);
        Collections.sort(orderedList);

        return orderedList;
    }

//belső Comparator osztály
    public class AuthorComparator implements Comparator<Book> {
        @Override
        public int compare(Book o1, Book o2) {
            return o1.getAuthor().compareTo(o2.getAuthor());
        }
    }


    public List<Book> orderedByAuthor() {
        List<Book> orderedList = new ArrayList<>(libraryBooks);
        Collections.sort(orderedList, new AuthorComparator());

            return orderedList;
    }


    //magyar ékezeteket is figyelembe véve:
    //Csak a könyvcímek kellenek, nem a könyvek! a feladat szerint:


    public List<String> orderedByTitleLocale(Locale locale) {

        List<String> orderedList = new ArrayList<>();
        for (Book book : libraryBooks) {
            orderedList.add(book.getTitle());
        }

        Collator hungarianCollator = Collator.getInstance(locale);
        hungarianCollator.setStrength(Collator.PRIMARY);
        Collections.sort(orderedList, hungarianCollator);

        return orderedList;
    }

}

