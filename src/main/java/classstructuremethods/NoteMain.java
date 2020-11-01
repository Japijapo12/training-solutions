package classstructuremethods;

public class NoteMain {
    public static void main(String[] args) {
        Note note = new Note();
        note.setName("Horváth Ilona");
        note.setTopic("Kompót készítése");
        note.setText("Hámozzuk meg az almát, és főzzük rövid ideig cukros, szegfűszeges, fahéjas vízben.");

        System.out.println(note.getNoteText());
    }

}
