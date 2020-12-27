package schoolrecords;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private final List<Mark> marks = new ArrayList<>();

    private boolean isEmpty(String str) {
        return str == null || "".equals(str.trim());
    }
    public Student(String name) {
        if(isEmpty(name)) {
            throw new IllegalArgumentException("Student name must not be empty!");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double calculateAverage() {
        if (marks.isEmpty()) {
            return 0;
        }
        double sum = 0;
        for (Mark mark : marks) {
            sum += mark.getMarkType().getValue();
        }
        double average = sum / marks.size();
        return average;
    }

    public double calculateSubjectAverage(Subject subject) {
        if (marks.isEmpty()) {
            return 0;
        }
        int sumSubject = 0;
        int count = 0;
        for (Mark mark : marks) {
            if (mark.getSubject().getsubjectName().equals(subject.getsubjectName())) {
                sumSubject += mark.getMarkType().getValue();
                count ++;
            }
        }
        if(count == 0)  {
            return 0;
        }
        double average = sumSubject / count;
        return average;
    }

    public void grading(Mark mark) {
        if (mark == null) {
            throw new NullPointerException("Mark must not be null!");
        }
        marks.add(mark);
    }

}
