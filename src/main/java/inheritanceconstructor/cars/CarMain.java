package inheritanceconstructor.cars;

public class CarMain {

    public static void main(String[] args) {
        Car car = new Car(10,40, 50);

        System.out.println(car.calculateRefillAmount());

    }
}
