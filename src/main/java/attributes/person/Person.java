package attributes.person;

public class Person {

    private String name;
    private String identificationCard;
    private Address address;

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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", identificationCard='" + identificationCard + '\'' +
                '}';
    }

    public void correctData (String name, String identificationCard) {
        this.name = name;
        this.identificationCard = identificationCard;
        }

    public Address getAddress() {
        return address;
    }

    public void moveTo(Address address) {
        this.address = address;
        }

}
