package meetingrooms;

import java.util.Scanner;

public class Controller {

    private final Office office = new Office();

    public void readOffice() {
        System.out.println("Adja meg a tárgyalók számát!");
        Scanner scanner = new Scanner(System.in);

        int meetingRoomCount = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < meetingRoomCount; i++) {
            System.out.println("Adja meg a tárgyaló nevét!");
            String name = scanner.nextLine();
            System.out.println("Adja meg a tárgyaló hosszúságát!");
            int length = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Adja meg a tárgyaló szélességét!");
            int width = scanner.nextInt();
            scanner.nextLine();

            MeetingRoom meetingRoom = new MeetingRoom(name, length, width);
            office.addMeetingRoom(meetingRoom);


        }
        System.out.println(office.getMeetingRooms());


    }

    public void printMenu() {
        System.out.println("1. Tárgyalók sorrendben\n" +
                "2. Tárgyalók visszafele sorrendben\n" +
                "3. Minden második tárgyaló\n" +
                "4. Területek\n" +
                "5. Keresés pontos név alapján\n" +
                "6. Keresés névtöredék alapján\n" +
                "7. Keresés terület alapján");

    }

    public void runMenu() {
        System.out.println("Melyik menüpontot választja?");
        Scanner scanner = new Scanner(System.in);
        int menuItem = scanner.nextInt();
        scanner.nextLine();

        if (menuItem == 1) {
            office.printNames();
        }

       /* if (menuItem == 2) {
            office.printNamesReverse();
        }*/

      /*  if (menuItem == 3) {
            office.printEventNames();
        }*/

        if (menuItem == 4) {
            office.printAreas();
        }

        if (menuItem == 5) {
            System.out.println("Adja meg a keresett tárgyaló pontos nevét:");
            String name = scanner.nextLine();

            office.printMeetingRoomsWithNames(name);
        }

        if (menuItem == 6) {
            System.out.println("Adja meg a név részletét:");
            String namefragment = scanner.nextLine();

            office.printMeetingRoomsContains(namefragment);
        }

        if (menuItem == 7) {
            System.out.println("Mekkora területnél legyen nagyobb?");
            int area = scanner.nextInt();
            scanner.nextLine();

            office.printAreasLargerThan(area);
        }

    }

    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.readOffice();
        controller.printMenu();
        controller.runMenu();
    }


}
