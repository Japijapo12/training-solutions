package attributes.person;

import java.util.Scanner;

public class PersonMain {
    public static void main(String[] args) {

        Person person = new Person("John Doe", "AU-4234223");

        System.out.println(person.personToString());

        person.correctData("Jack Doe", "PU-4234220");

        System.out.println(person.personToString());


        System.out.println("Country:");
        Scanner scanner = new Scanner(System.in);
        String country = scanner.nextLine();

        System.out.println("City:");
        String city = scanner.nextLine();

        System.out.println("streetAndNumber:");
        String streetAndNumber = scanner.nextLine();

        System.out.println("zipCode:");
        String zipCode = scanner.nextLine();

        Address address = new Address(country, city, streetAndNumber, zipCode);
        System.out.println(address);

        address.correctData("Spanyolo.", "Barcelona", "jljl 3", "32532452");

        System.out.println(address.addressToString() );




    }

}
