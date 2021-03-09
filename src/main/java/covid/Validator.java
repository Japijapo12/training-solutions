package covid;

public class Validator {

    public boolean isValidName(String name) {
        return (name != null) && !name.isEmpty() && !name.isBlank();
    }

    public boolean isValidZip(String zip) {
        return (zip != null) && !zip.isEmpty() && !zip.isBlank();
    }

}
