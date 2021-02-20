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


/*Egy könyvtár nyilvántartása a könyvek leltári számát, szerzőjét, címét és a kiadás évét
tartalmazza. Készíts egy Book osztályt, mely konstruktorában megkapja ezeket az
adatokat! Minden adata lekérdezhető, de egyik sem módosítható. A Library osztály
attribútumként egy List<Book>-ot tartalmaz. A loadFromFile() metódusa a classpathon
található books.csv fájlból tölti be a könyvek adatait. A fájl minden sora egy könyv
adatait tartalmazza pontosvesszővel elválasztva.
Tipp: Könnyebb a fájl olvasása, ha mind a ;-t, mind a sorvége karaktert beállítod a
Scanner elválasztójaként. Ehhez használd delimiterként a ";|(\r\n)" kifejezést!
 */