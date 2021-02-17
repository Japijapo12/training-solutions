package numbers;

public class Circle {
    private int diameter;
    private final static double PI = 3.14;

    public Circle(int diameter) {
        this.diameter = diameter;
    }

    public double perimeter(int diameter) {
        return diameter * PI;
    }

    public double area(int diameter) {
        return (double) diameter * diameter / 4 * PI;
    }


}
