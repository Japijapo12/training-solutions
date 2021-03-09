package covid;

public class Zip {

    private final String zip;
    private final String city;
    private final String cityPart;

    public Zip(String zip, String city, String cityPart) {
        this.zip = zip;
        this.city = city;
        this.cityPart = cityPart;
    }

    public String getZip() {
        return zip;
    }

    public String getCity() {
        return city;
    }

    public String getCityPart() {
        return cityPart;
    }
}
