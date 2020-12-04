package week06d05;

public class Main {

    public static void main(String[] args) {
        Biscuit biscuit = new Biscuit(BiscuitType.ZIEGLER, 25);

        System.out.println(biscuit.of(biscuit.getBiscuitType(), biscuit.getGramAmount()).toString());

    }
}
