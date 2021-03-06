package schoolrecords;

import java.util.ArrayList;
import java.util.List;

public class Tutor {

    private String name;

    private List<Subject> taughtSubjects = new ArrayList<>();

    public Tutor(String name, List<Subject> subjects) {
        this.name = name;
        for (Subject s : subjects) {
            taughtSubjects.add(s);
        }
    }

    public String getName() {
        return name;
    }


    public boolean tutorTeachingSubject(Subject subject) {
        for (Subject s : taughtSubjects) {
            if (s.getsubjectName().equals(subject.getsubjectName())) {
                return true;
            }
        }
        return false;
    }
}


