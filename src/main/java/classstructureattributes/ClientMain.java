package classstructureattributes;

public class ClientMain {
    public static void main(String[] args) {
        Client client = new Client();
        client.name = "Kovács János";
        client.year = 20;
        client.address = "Pitypang u. 3.";

        System.out.println(client.name);
        System.out.println(client.year);
        System.out.println(client.address);
    }
}
