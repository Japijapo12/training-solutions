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

    public boolean areTheyEqual(String name) {
        return this.name.equals(name);
    }


    public static void main(String[] args) {
        Product product = new Product("iPhoneSE", "123456");

        System.out.println(product.areTheyEqual("iPhone"));
        System.out.println(product.areTheyEqual("iPhoneSE"));
    }

}

