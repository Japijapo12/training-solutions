package introconstructors.restaurant;

public class RestaurantMain {

    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant("Kilenc sárkány", 10);

        System.out.println(restaurant.getName());
        System.out.println(restaurant.getCapacity());
        System.out.println("Menu: " + restaurant.getMenu());
    }


}
