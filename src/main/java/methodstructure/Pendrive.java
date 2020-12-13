package methodstructure;

public class Pendrive {

    private String name;
    private int capaticy;
    private int price;

    public Pendrive(String name, int capaticy, int price) {
        this.name = name;
        this.capaticy = capaticy;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getCapaticy() {
        return capaticy;
    }

    public int getPrice() {
        return price;
    }

    public void risePrise(int percent) {
        this.price = this.price + (this.price * percent);
    }

    private double pricePerCapacity() {
        return price/capaticy;
    }

    int comparePricePerCapacity(Pendrive otherPendrive) {
        if (pricePerCapacity() > otherPendrive.pricePerCapacity()) {
            return 1;
        }
        if (pricePerCapacity() < otherPendrive.pricePerCapacity()) {
            return -1;
        }
        return 0;

    }

    boolean cheaperThan(Pendrive otherPendrive) {
        return this.price < otherPendrive.price;

    }

    @Override
    public String toString() {
        return "Pendrive{" +
                "name='" + name + '\'' +
                ", capaticy=" + capaticy +
                ", price=" + price +
                '}';
    }
}
