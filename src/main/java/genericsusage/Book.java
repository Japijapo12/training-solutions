package genericsusage;

public class Book {

    private String name;
    private String title;

    public Book(String name, String title) {
        this.name = name;
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }
}
