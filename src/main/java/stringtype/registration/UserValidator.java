package stringtype.registration;

public class UserValidator {
    String username;
    String password;
    String email;

    public boolean isValidUsername(String username) {
        return username.length() != 0;
    }

    public boolean isValidPassword(String password1, String password2) {
        return password1.length() >= 8 && password1.equals(password2);
    }

    public boolean isValidEmail(String email)  {
        int kukac = email.indexOf("@");
        int pontHelye = email.indexOf(".");

        return (kukac > 0 && pontHelye > 2);

    }




}
