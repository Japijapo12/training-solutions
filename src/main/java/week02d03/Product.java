package week02d03;

public class Product {

    private String name;
    private String code;

    public Product(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public boolean areTheyEqual(Product product) {
        return this.name.equals(product.getName());
    }


    public static void main(String[] args) {
        Product product = new Product("iPhoneSE", "123456");
        Product product2 = new Product("iPhone", "123444");
        Product product3 = new Product("iPhoneSE", "123444");

        System.out.println(product.areTheyEqual(product2));
        System.out.println(product.areTheyEqual(product3));

    }

}

