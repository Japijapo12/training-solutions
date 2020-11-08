package objects;

import java.util.List;

public class ObjectsMain {
    public static void main(String[] args) {

        //Példányosíts egy Book objektumot, de ne add értékül semminek!

        new Book();

        //A System.out.println() metódus paramétereként adj át egy, a paraméterben most példányosított objektumot!

        System.out.println(new Book());
        //objects.Book@378bf509


        //Deklarálj egy Book típusú emptyBook változót, Adj neki értéket, méghozzá a null literált! Írasd ki az értékét!
        Book emptyBook = null;
        System.out.println(emptyBook);
        //null


        //Definiálj egy book nevű változót, és add értékül neki a definíciós utasításban példányosított Book objektumot!
        Book emptybook = new Book();
        System.out.println(emptybook);


        Book book = new Book();

        System.out.println(book);

        book = null;

        System.out.println(book);

        book = new Book();


        //Hozz létre egy anotherBook változót, és adj értékül neki egy új Book példányt!
        Book anotherbook = new Book();
        System.out.println(book == anotherbook);

        anotherbook = book;
        System.out.println(anotherbook);
        System.out.println(book == anotherbook);


        Book[] books = {new Book(), new Book(), new Book()};



    }
}
