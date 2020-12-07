package inheritanceconstructor;

public class CarMain {

    public static void main(String[] args) {
        Car car = new Car(10,40, 50);

        System.out.println(car.calculateRefillAmount());
        System.out.println("Még ennyi benzined maradt: " + car.drive(20));
    }
}
