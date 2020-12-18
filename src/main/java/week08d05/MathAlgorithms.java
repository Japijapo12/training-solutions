package week08d05;

public class MathAlgorithms {

    public int greatestCommonDivisor(int a, int b) {

        int gCDiv = 1;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                gCDiv = i;
            }
        }
        return gCDiv;

    }


    public static void main(String[] args) {
        MathAlgorithms mathAlgorithms = new MathAlgorithms();

        System.out.println(mathAlgorithms.greatestCommonDivisor(16, 24));

    }
}