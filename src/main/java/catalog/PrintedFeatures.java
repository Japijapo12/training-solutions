package catalog;

import java.util.List;

public class PrintedFeatures implements Feature {

    private String title;
    private int numberOfPages;
    private List<String> authors;

    public PrintedFeatures(String title, int numberOfPages, List<String> authors) {

        parameterValidator(title, numberOfPages, authors);

    this.title = title;
        this.numberOfPages = numberOfPages;
        this.authors = authors;
    }

    @Override
    public String getTitle() {
        return title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    @Override
    public List<String> getContributors() {
        return authors;
    }


    private void parameterValidator(String title, int numberOfPages, List<String> authors) {

        if (Validators.isBlank(title)) {
            throw new IllegalArgumentException ("Empty title");
        }
        if ( Validators.isEmpty(authors)) {
            throw new IllegalArgumentException ("Authors  cannot be empty!");
        }

        if (numberOfPages <= 0) {
            throw new IllegalArgumentException("numberOfPages is invalid!");
        }
    }


}
