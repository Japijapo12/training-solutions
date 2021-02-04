package collectionsset.collectionshashset;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class RandomStringGenerator {

    public Collection<String> createStrings(int length, int numberOfElements) {
        Collection<String> collection = new ArrayList<>();
        for (int i = 0; i < numberOfElements; i++) {
            collection.add(randomString(length));
        }
        return collection;
    }

    private String randomString(int length) {
        StringBuilder sb = new StringBuilder("");
        Random rnd = new Random();
        for (int i = 0; i < length; i++) {
            int code = rnd.nextInt('z' - 'a');
            code += 'a';
            char x = (char) code;
            sb.append(x);
        }
        return sb.toString();
    }




    //ez itt egy gyakorlópélda a random karakterek generálására megadott Stringből
    //java.util.Random.nextInt
    public static void main(String[] args) {


        Random random = new Random();

        String alphabet = "123xyz";
        for (
                int i = 0;
                i < 10; i++) {
            System.out.println(alphabet.charAt(random.nextInt(alphabet.length())));
        }

    // egy random karakter generálása az angol abc-ből:
        char randomCharater = (char)(random.nextInt('z' - 'a') + 'a');
        System.out.println(randomCharater);
    }
}
