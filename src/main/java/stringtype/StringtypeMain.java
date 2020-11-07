package stringtype;

public class StringtypeMain {
    public static void main(String[] args) {
        String prefix = "Hello";
        String name = "John Doe";
        String message = prefix + " " + name;
        message = message + 444;

        System.out.println(message);

        boolean b = message.equals("Hello John Doe");

        boolean c = message.equals("Hello John Doe444");

        System.out.println(b);
        System.out.println(c);


        String empty1 = "";
        String empty2 = "";
        String empty3 = empty1 + empty2

        System.out.println(empty1 + empty2);
        System.out.println((empty3).length());

        String letters = "Abcde";
        System.out.println(letters.length());

        System.out.println(letters.substring(0,1) + ", " + letters.substring(2,3));

        System.out.println(letters.substring(0,3));

    }
}
