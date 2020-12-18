package week08d05;

public class MathAlgEuclid {

    public int greatestCommonDivisor(int a, int b) {

            if (a == 0)
                return b;

            while (b != 0) {
                if (a > b)
                    a = a - b;
                else
                    b = b - a;
            }

            return a;
        }


    public static void main(String[] args) {
        MathAlgorithms mathAlgorithms = new MathAlgorithms();

        System.out.println(mathAlgorithms.greatestCommonDivisor(9, 12));

    }

    }

