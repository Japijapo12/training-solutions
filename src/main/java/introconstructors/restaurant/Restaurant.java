package introconstructors.restaurant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Restaurant {

    public static final int SEATS = 4;

    private List<String> menu = new ArrayList<>();
    private String name;
    private int capacity;

    public Restaurant(String name, int numberOfTables) {
        this.name = name;
        this.capacity = numberOfTables * SEATS;
        this.menu = createMenu();
    }

    private List<String> createMenu() {
        return  Arrays.asList("Rántott hús krumplival", "Töltöttkáposzta", "Zöldbableves");
    }

    public List<String> getMenu() {
        return menu;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }
}
