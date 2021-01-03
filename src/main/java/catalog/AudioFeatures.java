package catalog;

import java.util.ArrayList;
import java.util.List;

public class AudioFeatures implements Feature {
    private String title;
    private int length;
    private List<String> performers;
    private List<String> composer;

    public AudioFeatures(String title, int length, List<String> performers) {

        parameterValidator(title, length, performers);

    this.title = title;
        this.length = length;
        this.performers = performers;
    }


    public AudioFeatures(String title, int length, List<String> performers, List<String> composer) {

        parameterValidator(title, length, performers);

        this.title = title;
        this.length = length;
        this.performers = performers;
        this.composer = composer;
    }


    private void parameterValidator(String title, int length, List<String> performers) {

        if (Validators.isBlank(title)) {
            throw new IllegalArgumentException ("Title cannot be null!");
        }
        if ( Validators.isEmpty(performers)) {
            throw new IllegalArgumentException ("Performers  cannot be empty!");
        }

        if (length <= 0) {
            throw new IllegalArgumentException("Length is invalid!");
        }
    }

    public int getLength() {
        return length;
    }

    @Override
    public String getTitle() {
        return title;
    }

    public List<String> getPerformers() {
        return performers;
    }

    public List<String> getComposer() {
        return composer;
    }

    @Override
    public List<String> getContributors() {

        List<String> contributors = new ArrayList<>(performers);

        if (!Validators.isEmpty(composer)) {
            contributors.addAll(composer);
        }
        return contributors;
    }

}
