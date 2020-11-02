package localvariables;

public class DistanceMain {
    public static void main(String[] args) {
        Distance distance = new Distance(9.33333,false );
        System.out.println(distance.getDistanceInKm() + " " + distance.isExact());

        int integerPart = (int) distance.getDistanceInKm();

        System.out.println(integerPart);



    }
}
