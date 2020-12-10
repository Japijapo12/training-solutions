package week07d04;

import java.time.LocalDate;

public class Lab {

    private String title;
    private boolean completed;
    LocalDate completedAt;

    public Lab(String title) {
        this.title = title;
        }

    public Lab(String title, LocalDate completedAt) {
        this.title = title;
        //this.completed = true;
        completed = true;
        this.completedAt = completedAt;
    }

    public void complete(LocalDate completedAt) {
        completed = true;
        this.completedAt = completedAt;
    }

    public void complete() {
        //this.completed = true;
        completed = true;
        completedAt = LocalDate.now();

    }

    @Override
    public String toString() {
        return "Lab{" +
                "title='" + title + '\'' +
                ", completed=" + completed +
                ", completedAt=" + completedAt +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public LocalDate getCompletedAt() {
        return completedAt;
    }

    public void setCompletedAt(LocalDate completedAt) {
        this.completedAt = completedAt;
    }
}
