package stringbuilder;

public class NameBuilder {

    public String concatNameWesternStyle(String firstName, String middleName, String lastName, Titulus titulus) {
        if(isEmpty(firstName) || isEmpty(lastName)) {
            throw new IllegalArgumentException("First name and last name must not be empty!");
        }

        StringBuilder builder = new StringBuilder();

        if( titulus != null) {
            builder.append(titulus.getTitulusString()).append(" ").append(firstName);
        }
        else {
            builder.append(firstName);
        }
        builder.append(" ");
        if (middleName != null && !"".equals(middleName)) {
            builder.append(middleName).append(" ");
        }
        builder.append(lastName);

        return builder.toString();
    }


    public String concatNameHungarianStyle(String firstName, String middleName, String lastName, Titulus titulus) {

        if(isEmpty(firstName) || isEmpty(lastName)) {
            throw new IllegalArgumentException("First name and last name must not be empty!");
        }

        StringBuilder builder = new StringBuilder();

        if( titulus != null) {
            builder.append(titulus.getTitulusString()).append(" ").append(lastName);
        }
        else {
            builder.append(lastName);
        }
        builder.append(" ");
        if (middleName != null && !"".equals(middleName)) {
            builder.append(middleName).append(" ");
        }
        builder.append(firstName);

        return builder.toString();
    }


    private boolean isEmpty(String str) {
        return str == null || "".equals(str.trim());

    }

    public static void main(String[] args) {
        NameBuilder nameBuilder = new NameBuilder();

        System.out.println(nameBuilder.concatNameWesternStyle("John", null,"Doe", Titulus.DR));
        System.out.println(nameBuilder.concatNameHungarianStyle("John", null,"Doe", Titulus.DR));

    }

}


