package week13d03;

public class Teacher {

    private String teachersName;
    private String subject;
    private String className;
    private int lessonPerWeek;

    public Teacher(String teachersName, String subject, String className, int lessonPerWeek) {
        this.teachersName = teachersName;
        this.subject = subject;
        this.className = className;
        this.lessonPerWeek = lessonPerWeek;
    }

    public String getTeachersName() {
        return teachersName;
    }

    public String getSubject() {
        return subject;
    }

    public String getClassName() {
        return className;
    }

    public int getLessonPerWeek() {
        return lessonPerWeek;
    }
}
