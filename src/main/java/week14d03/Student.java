package week14d03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student implements Comparable<Student> {

    private String name;

    //tantárgy, jegyek
    Map<String, List<Integer>> notes = new HashMap<>();


    public Student(String name) {
        this.name = name;
    }

    //copykonstruktor
    public Student(Student s) {
        name = s.name;
        notes = new HashMap<>(s.notes);
    }

    public void addNote(String subject, int note) {
        if (!notes.containsKey(subject)) {
            notes.put(subject, new ArrayList<>());
        }
        notes.get(subject).add(note);
    }


    public String getName() {
        return name;
    }

    public Map<String, List<Integer>> getNotes() {
        return notes;
    }

    @Override
    public int compareTo(Student o) {
        return name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", notes=" + notes +
                '}';
    }
}


//akkor adjuk a map-hez a tantárgyat, ha jegyet kap belőle (nem kell előre)