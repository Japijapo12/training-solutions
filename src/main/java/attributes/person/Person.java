package attributes.person;

public class Person {

    String name;
    String identificationCard;

    public Person (String name, String identificationCard) {
        this.name = name;
        this.identificationCard = identificationCard;

    }

    public String getName() {
        return name;
    }

    public String getIdentificationCard() {
        return identificationCard;
    }


    public String personToString() {
        return getName() + (", ") + getIdentificationCard();

    }

}
