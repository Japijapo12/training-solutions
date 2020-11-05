package arraylist;

public class BooksMain {
    public static void main(String[] args) {
        arraylist.Books books = new arraylist.Books();
        books.add("Róma története");
        books.add("Gyűrük ura 1.");
        books.add("Gyűrük ura 2.");
        books.add("Kína története");


        System.out.println(books.getTitles());

        System.out.println(books.findAllByPrefix("Gyűrük"));

        books.removeByPrefix("Gyűrük");
        System.out.println(books.getTitles());
    }
}
