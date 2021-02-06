package week14d03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClassNotebook {

    private List<Student> students;

    public ClassNotebook(List<Student> students) {
        this.students = students;
    }

    public List<Student> sortNotebook() {
        List<Student> result = new ArrayList<>(students); //másolatot ad vissza a listáról
        Collections.sort(result);
        return result;
        //Ha a Student-ben létrehozott copykonstruktort használom
        /*  for(Student s : students) {
            result.add(new Student(s));   <==!
            }
            Collections.sort(result);
            return result; */

    }

    public List<Student> getStudents() {
        return new ArrayList<>(students);    // nem csak return students
    }

    public static void main(String[] args) {
        ClassNotebook classNotebook = new ClassNotebook(new ArrayList<>(List.of(new Student("Jonn"), new Student("Bill"), new Student("Jack"))));


        classNotebook.sortNotebook().get(1).addNote("math", 5);
        System.out.println(classNotebook.getStudents());

        System.out.println(classNotebook.sortNotebook());
    }


}
