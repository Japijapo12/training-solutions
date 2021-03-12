package covid;

import org.mariadb.jdbc.MariaDbDataSource;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;


public class RegistrationMenuMain {

    private CitizenDao citizenDao;
    private FileManager fileManager;
    private Validator validator;
    private ZipDao zipDao;
    private static final Scanner scanner = new Scanner(System.in);
    private static final String MENU = "1. Regisztráció\n2. Tömeges regisztráció";



    public static void main(String[] args) {
        RegistrationMenuMain registrationMenuMain = new RegistrationMenuMain();

        //Flyway flyway = Flyway.configure().dataSource(dataSource).load();
        //flyway.clean();
        //1
        // flyway.migrate();



        char menuItem;
        System.out.println("Válasszon a menüpontok közül!");
        System.out.println(MENU);


        menuItem = scanner.nextLine().charAt(0);
        switch (menuItem){
            case '1':
                registrationMenuMain.registration();
                break;
            case '2':
                registrationMenuMain.massRegistration();
                break;
            default:
                throw new IllegalArgumentException("Nincs ilyen menüpont");
        }

    }


        private void registration() {

            MariaDbDataSource dataSource;
            try {
                dataSource = new MariaDbDataSource();
                dataSource.setUrl("jdbc:mariadb://localhost:3306/covid?useUnicode=true");
                dataSource.setUser("covid");
                dataSource.setPassword("covid");
            } catch (SQLException se) {
                throw new IllegalStateException("Can not connect", se);
            }

            Validator validator = new Validator();
            ZipDao zipDao = new ZipDao(dataSource);

            System.out.println("Név:");
            String name = scanner.nextLine();
            if (!validator.isValidName(name)) {
                throw new IllegalArgumentException("A név nem lehet üres!");
            }

            System.out.println("Irányítószám:");
            String zip = scanner.nextLine();
            if (!validator.isValidZip(zip)) {
                throw new IllegalArgumentException("Az irányítószám nem lehet üres!");
            }
            System.out.println(zipDao.selectCityByZip(zip));


            System.out.println("Életkor");
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.println("E-mail:");
            String email = scanner.nextLine();
            System.out.println("TAJ:");
            String taj = scanner.nextLine();

            Citizen citizen = new Citizen(name, zip, age, email, taj);
            //System.out.println(citizen);
            CitizenDao citizenDao = new CitizenDao(dataSource);

            citizenDao.insertCitizen(citizen);

        }

        private void massRegistration() {

            MariaDbDataSource dataSource;
            try {
                dataSource = new MariaDbDataSource();
                dataSource.setUrl("jdbc:mariadb://localhost:3306/covid?useUnicode=true");
                dataSource.setUser("covid");
                dataSource.setPassword("covid");
            } catch (SQLException se) {
                throw new IllegalStateException("Can not connect", se);
            }

        System.out.println("Adja meg a tömeges regisztrációhoz a fájl nevét!");
            String fileName = scanner.nextLine();
            try(BufferedReader reader = new BufferedReader(Files.newBufferedReader(Path.of("idosotthon.csv")))) {
                FileManager fileManager = new FileManager();
                List<Citizen> citizens = fileManager.loadCitizenList(reader);
                CitizenDao citizenDao = new CitizenDao(dataSource);
                citizenDao.insertCitizens(citizens);

        } catch (IOException e) {
                System.out.println("Invalid filename!");

        } catch (Exception e) {
                System.out.println("Invalid file!");
                e.printStackTrace();
            }

    }
}






/*
•	Teljes név
•	Irányítószám
•	Életkor
•	E-mail cím
•	TAJ száma

 */
