package week07d02;

public class DigitSum2 {

    public class DigitSum {

        public int sumOfDigits(int x) {
            String digits = Integer.toString(x);

            int sum = 0;
            for (int i = 0; i < digits.length(); i++) {
                sum += (Integer.parseInt(digits.substring(i, i + 1)));
            }
            return sum;
        }
    }
}
