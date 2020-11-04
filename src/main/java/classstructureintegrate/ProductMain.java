package classstructureintegrate;

import java.util.Scanner;

public class ProductMain {
    public static void main(String[] args) {


        System.out.println("A termék neve:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("A termék ára:");
        int price = scanner.nextInt();

        Product product = new Product(name, price);

        product.increasePrice(20);


        System.out.println(product.getName());
        System.out.println(product.getPrice() + " Ft");


        System.out.println("Árcsökkenés! A " + product.getName() + " új ára:");

        product.decreasePrice(40);
        System.out.println(product.getPrice());




    }
}
