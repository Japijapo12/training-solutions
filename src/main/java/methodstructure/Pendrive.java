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

    int comparePricePerCapacity(Pendrive pendrive) {
        if (pendrive.price/pendrive.capaticy > pendrive.getPrice()/pendrive.getCapaticy()) {
            return 1;
        }
        if (pendrive.price/pendrive.capaticy < pendrive.getPrice()/pendrive.getCapaticy()) {
            return -1;
        }
        return 0;

    }

    boolean cheaperThan(Pendrive pendrive) {
        return this.price < pendrive.price;

    }
}
