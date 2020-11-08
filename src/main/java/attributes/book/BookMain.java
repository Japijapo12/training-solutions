package attributes.book;

public class BookMain {
    public static void main(String[] args) {

        Book book = new Book("Harry Potter");

        System.out.println(book.getTitle());

        book.setTitle("A dzsungel könyve");

        System.out.println(book.getTitle());
    }
}
