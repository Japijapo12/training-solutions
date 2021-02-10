package week15d03;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PostFinder {

    List<Post> posts;

    public PostFinder(List<Post> posts) {
        this.posts = posts;
    }

    public List<Post> findPostsFor(String user) {
        Objects.requireNonNull(user, "User is null!");

        List<Post> validPost = new ArrayList<>();

        for (Post post : posts) {

            if (isDataCorrect(post.getPublishedAt())
                    && isNotBlank(post.getTitle())
                    && isNotBlank(post.getContent())
                    && post.getOwner().equals(user) ) {
                validPost.add(post);

            }

        }
        return validPost;
    }

    public boolean isNotBlank(String str) {
        return str != null && !str.isBlank();
    }

    public boolean isDataCorrect(LocalDate date) {
        return date.isBefore(LocalDate.now());
    }


}
