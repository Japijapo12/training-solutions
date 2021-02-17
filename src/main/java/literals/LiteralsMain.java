package literals;

public class LiteralsMain {

    public static void main(String[] args) {

        System.out.println(1 + "" + 2);
        System.out.println(1 + Integer.toString(2));

        double quotient = (double) 3/4;
        System.out.println(quotient);

        long big = 3_244_444_444L;
        System.out.println(big);

        String str = "árvíztűrőtükörfúrógép";  //UTF-8
        System.out.println(str);

        String word = "title".toUpperCase();
        System.out.println(word);

        System.out.println(Integer.toBinaryString(1));
        System.out.println(Integer.toBinaryString(-2));

    }
}
