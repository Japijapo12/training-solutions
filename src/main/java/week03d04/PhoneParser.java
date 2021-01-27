package week03d04;

public class PhoneParser {

    public Phone parse(String phoneNumber){

        String prefix = phoneNumber.substring(0,2);
        String number = phoneNumber.substring(3);

        return new Phone(prefix, number);


    //    return new Phone(phoneNumber.substring(0,2), phoneNumber.substring(3));

    }

    public static void main(String[] args) {
        String s = "10-1234567";
        PhoneParser phoneParser = new PhoneParser();

        Phone phone = phoneParser.parse(s);

        System.out.println(phone.getPrefix() + "-" + phone.getNumber());
    }

}



// Írj egy PhoneParser osztályt egy parse(String) metódussal, ami beolvas egy 10-1234567 formátumú szöveget,
// és visszaad egy Phone objektumot, feltöltve a prefix értékét 10, a number értékét 1234567 értékekkel!