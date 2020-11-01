package classstructuremethods;

public class ClientMain {
    public static void main(String[] args) {
        Client client = new Client();

        client.setName("Kovács János");
        client.setYear(1950);
        client.setAddress("Budapest, Ó utca 3.");

        System.out.println(client.getName());
        System.out.println(client.getYear());
        System.out.println(client.getAddress());

        client.migrate("Pécs, Ló utca 9.");
        System.out.println(client.getAddress());
    }
}
