package schoolrecords;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ClassRecords {

    private String className;
    private Random rnd;
    private List<Student> students = new ArrayList<>();

    public ClassRecords(String className, Random rnd) {
        this.className = className;
        this.rnd = rnd;
    }

    public String getClassName() {
        return className;
    }

    /* a lista ciklussal bejárása helyett van a getStudentByNameOrNull
        for (Student s : students) {
               if(s.getName().equals(student.getName())) {
                    .......return students.add(student);
                    .......return students.remove(student);
                }
            } */

    public Student getStudentByNameOrNull(String name) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                return student;
            }
        }
        return null;
    }

    //felelésre random kiválaszt egy diákot

    public Student repetition() {
        if (students.isEmpty()) {
            throw new IllegalArgumentException("No students to select for repetition!");
        }
        return students.get(this.rnd.nextInt(students.size()));
    }

    private boolean isEmpty(String name) {
        return name == null || "".equals(name.trim());
    }


    public Student findStudentByName(String name) {
        if (students.isEmpty()) {
            throw new IllegalArgumentException("No students to search!");
        }
        if (isEmpty(name)) {
            throw new IllegalArgumentException("Student name must not be empty!");
        }

        Student student = getStudentByNameOrNull(name);
        if (student == null) {
            throw new IllegalArgumentException("Student by this name cannot be found! " + name);
        }
        return student;
    }


    public boolean addStudent(Student student) {
        if (getStudentByNameOrNull(student.getName()) != null) {
            return false;
        }
        return students.add(student);
    }

    public boolean removeStudent(Student student) {
        Student toRemoveStudent = (getStudentByNameOrNull(student.getName()));
        if (toRemoveStudent != null) {
            students.remove(toRemoveStudent);
            return true;
        }
        return false;
    }

    public double calculateClassAverage() {
        if (students.isEmpty()) {
            throw new ArithmeticException("No student in the class, average calculation aborted!");
        }

        double classAverage = 0;
        int countStudent = 0;
        for (Student student : students) {
            classAverage += student.calculateAverage();
            countStudent++;
        }

        if (countStudent == 0) {
            throw new ArithmeticException("No marks present, average calculation aborted!");
        }
        return classAverage / countStudent;
    }

    public double calculateClassAverageBySubject(Subject subject) {
        if (students.isEmpty()) {
            throw new ArithmeticException("No student in the class, average calculation aborted!");
        }

        double classAverageBySubject = 0;
        int countStudent = 0;
        for (Student student : students) {
            classAverageBySubject += student.calculateSubjectAverage(subject);
            countStudent++;
        }

        if (countStudent == 0) {
            throw new ArithmeticException("No marks present, average calculation aborted!");
        }
        return classAverageBySubject;
    }


    public List<StudyResultByName> listStudyResults() {

        List<StudyResultByName> tempList = new ArrayList<>();
        for (Student student : students) {
            tempList.add(new StudyResultByName(student.getName(), student.calculateAverage()));
        }
        return tempList;
    }


    public String listStudentNames() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Student s : students) {
            stringBuilder.append(s.getName()).append(", ");
        }
        return stringBuilder.toString().substring(0, stringBuilder.toString().lastIndexOf(","));
    }

}
