package week04d01;

public class NameChanger {

    private String fullname;

    public NameChanger(String fullName){
        if (fullName == null || fullName.equals("")) {
            throw new IllegalArgumentException("Invalid name: " + fullName);
        }

        this.fullname = fullName.trim();

        String firstName = fullName.substring(0, fullName.indexOf(" "));
        String lastName = fullName.substring(fullName.indexOf(" ")+1);

    }

    public String getFullname() {
        return fullname;
    }

    public String changeFirstName(String firstName) {
        String str = firstName.trim();
        fullname = fullname.replace(fullname.substring(0, fullname.indexOf(" ")),str);
        return fullname;
    }

    public static void main(String[] args) {
        NameChanger nameChanger = new NameChanger("John Doe");

        System.out.println(nameChanger.changeFirstName("Jack"));
    }


}



//Készítsd el a NameChanger osztályt, melynek privát attribútuma legyen a String fullName,
// mely egy ember teljes nevét reprezentálja!
// A fullName attribútum [vezetéknév][szóköz][keresztnév] formátumban épül fel.
// A konstruktor állítsa be a paraméterül kapott értékre az adattagot, de ha az érték null, vagy üres String,
// akkor dobjon egy IllegalAgrumentException kivételt a következő üzenettel: Invalid name:[paraméter értéke]!

//Legyen egy changeFirstName(String firstName) metódusa, mely megváltoztatja az objektum állapotát és kicseréli a vezetéknevet a paraméterül kapott értékre!
