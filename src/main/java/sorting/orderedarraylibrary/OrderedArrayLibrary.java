package sorting.orderedarraylibrary;

import java.util.Arrays;
import java.util.Comparator;

public class OrderedArrayLibrary {

    private final Book[] bookArray;

    public OrderedArrayLibrary(Book[] bookArray) {
        this.bookArray = bookArray;
    }

    public Book[] sortingById() {

        //másolatot hozunk létre a tömbről
        Book[] books = new Book[bookArray.length];  //bookArray tömb méretŰ
        System.arraycopy(bookArray, 0, books, 0, bookArray.length);
        Arrays.sort(books);
        return books;
    }

    public Book[] sortingByTitle() {
        Comparator<Book> titleComparator = new Comparator<Book>() {

            @Override
            public int compare(Book book1, Book book2) {
                return book1.getTitle().compareTo(book2.getTitle());
            }
        };

        //másolatot hozunk létre
        Book[] books = new Book[bookArray.length];
        System.arraycopy(bookArray, 0, books, 0, bookArray.length);
        Arrays.sort(books, titleComparator);
        return books;
    }


}


//Tömbök között adatok átmásolásának azonban annál jobb módja is van, minthogy
//ciklussal bejárjuk, és egyenként átmásoljuk az elemeket: a System.arraycopy()
//metódus. jegyzet Tömbök, 77. oldal

//fruits átmásolása faviriteFruits tömbbe:
//String[] favoriteFruits = new String[2];
//System.arraycopy(fruits, 1, favoriteFruits, 0, 2); // favoriteFruits -->
//{"peach", "plum"}


//Feladat:
//Készítsünk olyan osztályt, ami egy könyvtárban tárolt könyvek szoftveres rendezéseit
//valósítja meg. A könyvtárban a könyveket tömb segítségével tároljuk, ezt kell rendezni
//igény esetén különböző szempontok alapján.
//Megvalósítás
//Book osztály int id String title és String author attribútumokkal.
//A public int compareTo(Book o) metódust az igényeknek megfelelően készítsük el.
//Alapértelmezett az id szerinti rendezés.
//OrderedArrayLibrary osztály private Book[] bookArray attribútummal. Ezt
//konstruktorból tudjuk feltölteni.
//publikus metódusok:
//public OrderedArrayLibrary(Book[] bookArray)
//public Book[] sortingById()
//public Book[] sortingByTitle()
//A rendezés során az eredeti tömb egy másolatát adjuk vissza, a megfelelő szempont
//szerint rendezve!
//Tipp
//A rendezéshez szükséges Comparator objektumot előállíthatjuk külön osztályból, vagy
//névtelen osztályból is.