package covid;

public class Validator {

    public boolean isValidName(String name) {
        return (name != null) && !name.isEmpty() && !name.isBlank();
    }

    public boolean isValidZip(String zip) {
        return (zip != null) && !zip.isEmpty() && !zip.isBlank() && zip.length() == 4;
    }


    public boolean tajControl(String taj) {

        if (taj.length() != 9) {
            throw new IllegalArgumentException("A tajszámnak 9 számjegyből kell állnia!");
        }


        long sum = 0;
        for (int i = 0; i < 8; i++) {
            long tajNumber = (Long.parseLong(taj.substring(i, i + 1)));
            System.out.println(tajNumber);
            if (tajNumber % 2 == 0) {
                tajNumber = tajNumber * 3;
                sum = sum + tajNumber;
            } else {
                tajNumber = tajNumber * 7;
                sum = sum + tajNumber;
            }
        }
        System.out.println(sum);

        return ( sum % 10 == Long.parseLong(taj.substring(8))) ;

    }


    public boolean isValidAge(int age) {
        return age >= 10 && age <= 150;
    }

    public boolean isValidEmail(String email) {
        return email.length()>=3 && email.contains("@");
    }

    public boolean isValidEmailRepeat(String email, String email2) {
        return email.equals(email2) && isValidEmail(email2);
    }

    public static void main(String[] args) {
        Validator validator = new Validator();
        validator.tajControl("123456788");
    }

}


