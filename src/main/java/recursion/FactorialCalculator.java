package recursion;

public class FactorialCalculator {
    public long getFactorial(int number) {
        if (number > 1) {
            return number * getFactorial(number - 1);
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        FactorialCalculator fc = new FactorialCalculator();
        System.out.println(fc.getFactorial(4)); // 4 * 3 * 2 * 1 == 24
    }
}
