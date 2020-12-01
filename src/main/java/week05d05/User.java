package week05d05;

public class User {

    private String firstName;
    private String lastName;
    private String email;


    //kérdés: miért kell a konstruktorban ellenőrizni?
    //hogyan lehet hivatkozni rá így a tesztben? Ha külön metódus lenne, könnyebb!?

    public User(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;

        int kukac = email.indexOf("@");

        if (!email.contains("@") || !email.substring(kukac).contains(".")) {
            throw new IllegalArgumentException("Hibás emailcím!");
        }

    }

    public String getFullName() {
        String fullname = firstName + " " + lastName;

        return fullname;
    }
}
