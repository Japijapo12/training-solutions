package attributes.person;

public class PersonMain {
    public static void main(String[] args) {

        Person person = new Person("John Doe", "AU-4234223");

        System.out.println(person.personToString());
    }
}
