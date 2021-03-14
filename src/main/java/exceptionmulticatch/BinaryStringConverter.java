package exceptionmulticatch;

public class BinaryStringConverter {


    public boolean[] binaryStringToBooleanArray(String binaryString) {   //"01110100111"
        if (binaryString == null) {
            throw new NullPointerException("binaryString null");
        }

        boolean[] booleans = new boolean[binaryString.length()];
        for (int i = 0; i < binaryString.length(); i++) {
            char c = binaryString.charAt(i);
            if (c != '0' && c != '1') {
                throw new IllegalArgumentException("binaryString not valid!");
            }

            booleans[i] = c == '1';
        }
        return booleans;
    }


    public String booleanArrayToBinaryString(boolean[] booleans) { //true, false, true, true
        if (booleans == null) {
            throw new NullPointerException("boolean is null");
        }
        if (booleans.length == 0) {
            throw new IllegalArgumentException("booleans size is 0");
        }

        StringBuilder builder = new StringBuilder(booleans.length);

        for (int i = 0; i < booleans.length; i++) {
            if (booleans[i]) {
                builder.append('1');
            } else {
                builder.append('0');
            }
        }
        return builder.toString();
    }
}




