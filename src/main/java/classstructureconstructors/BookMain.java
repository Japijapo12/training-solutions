package classstructureconstructors;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book("L. Ny. Tolsztoj", "Háború és béke");
        book.register("035648");

        System.out.println(book.getAuthorAndTitle());
        System.out.println(book.getRegNumber());

    }
}
