package introconstructors.task;

public class TaskMain {

    public static void main(String[] args) {

        Task task = new Task("Zongoraóra", "skálázás");

        System.out.println("Title: " + task.getTitle());
        System.out.println("Description: " + task.getDescription());

        task.start();
        task.setDuration(100);

        System.out.println("The " + task.getTitle()  + " start at " + task.getStartDateTime() + ", and took " + task.getDuration() + " minutes.");
    }
}
