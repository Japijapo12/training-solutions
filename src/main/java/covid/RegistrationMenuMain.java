package covid;

import org.mariadb.jdbc.MariaDbDataSource;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;


public class RegistrationMenuMain {

    private static final Scanner scanner = new Scanner(System.in);
    private static final String MENU =
            "1. Regisztráció\n" +
            "2. Tömeges regisztráció\n" +
            "3. Oltandók generálása\n" +
            "4. Oltás\n" +
            "5. Oltás meghiúsulás\n" +
            "6. Riport\n";


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
        switch (menuItem) {
            case '1' -> registrationMenuMain.registration();
            case '2' -> registrationMenuMain.massRegistration();
            case '3' -> registrationMenuMain.generation();
            case '4' -> registrationMenuMain.injection();
            case '5' -> registrationMenuMain.injectionFailure();
            case '6' -> registrationMenuMain.report();
            default -> throw new IllegalArgumentException("Nincs ilyen menüpont");
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
            throw new IllegalArgumentException("Az irányítószám nem lehet üres és csak négyjegyű szám lehet!");
        }
        System.out.println(zipDao.selectCityByZip(zip));


        System.out.println("Életkor");
        int age = scanner.nextInt();
        if (!validator.isValidAge(age)) {
            throw new IllegalArgumentException("Az életkor csak 10-nél nagyobb és 150-nél kisebb szám lehet!");
        }


        scanner.nextLine();
        System.out.println("E-mail:");
        String email = scanner.nextLine();
        if (!validator.isValidEmail(email)) {
            System.out.println("Az emailcím formátuma nem megfelelő!");
        }
        System.out.println("Adja meg az e-mailcímet még egyszer:");
        String email2 = scanner.nextLine();
        if (!validator.isValidEmailRepeat(email, email2)) {
            System.out.println("A két emailcím nem egyezik!");
        }

        System.out.println("TAJ:");
        String taj = scanner.nextLine();
        if (!validator.tajControl(taj)) {
            System.out.println("Ez nem egy tajszám!");
        }
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
        try (BufferedReader reader = new BufferedReader(Files.newBufferedReader(Path.of(fileName)))) {  //idosotthon.csv
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

    public void generation() {

        MariaDbDataSource dataSource;
        try {
            dataSource = new MariaDbDataSource();
            dataSource.setUrl("jdbc:mariadb://localhost:3306/covid?useUnicode=true");
            dataSource.setUser("covid");
            dataSource.setPassword("covid");
        } catch (SQLException se) {
            throw new IllegalStateException("Can not connect", se);
        }

        ZipDao zipDao = new ZipDao(dataSource);
        Validator validator = new Validator();

        System.out.println("Adjon meg egy irányítószámot!");
        String zip = scanner.nextLine();
        if (!validator.isValidZip(zip)) {
            throw new IllegalArgumentException("Az irányítószám nem lehet üres!");
        }


        zipDao.selectCityByZip(zip);

        VaccinationDao vaccinationDao = new VaccinationDao(dataSource);

        List<Citizen> result = vaccinationDao.selectCitizenByZipToGeneration(zip);

        /*for (Citizen citizen : result) {
            System.out.println(citizen.toString());
        }
        */

        System.out.println("Fájl mentése: Adja meg a fájl nevét, ahová menteni kívánja az oltandók listáját!");
        String fileName = scanner.nextLine();
        //elmentjük fájlba a listát
        try (BufferedWriter writer = new BufferedWriter(Files.newBufferedWriter(Path.of(fileName)))) {   //oltandok.txt
                for (Citizen citizen : result) {
                    writer.write(citizen.toString());
                }
            } catch (IOException ioe) {
                throw new IllegalStateException("Can not read file", ioe);
            }
        }


    //4. Oltás
    public void injection() {
        MariaDbDataSource dataSource;
        try {
            dataSource = new MariaDbDataSource();
            dataSource.setUrl("jdbc:mariadb://localhost:3306/covid?useUnicode=true");
            dataSource.setUser("covid");
            dataSource.setPassword("covid");
        } catch (SQLException se) {
            throw new IllegalStateException("Can not connect", se);
        }

        System.out.println("TAJ:");
        String taj = scanner.nextLine();
        VaccinationDao vaccinationDao = new VaccinationDao(dataSource);
        System.out.println(vaccinationDao.selectByTaj(taj));

    }

    //5. Meghiúsulás
    public void injectionFailure() {

    }

    //6. Riport
    public void report() {

    }


    }

