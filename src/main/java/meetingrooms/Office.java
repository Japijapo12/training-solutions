package meetingrooms;

import java.util.ArrayList;
import java.util.List;

public class Office {

    public List<MeetingRoom> meetingRooms = new ArrayList<>();

    public List<MeetingRoom> getMeetingRooms() {
        return meetingRooms;
    }

    public void setMeetingRooms(List<MeetingRoom> meetingRooms) {
        this.meetingRooms = meetingRooms;
    }



    public void addMeetingRoom(MeetingRoom meetingRoom) {
        meetingRooms.add(meetingRoom);

    }

    public void printNames() {
        for (MeetingRoom meetingRoom : meetingRooms) {
            System.out.println(meetingRoom.getName());
        }

    }



   public void printNamesReverse() {

   }

    public void printEventNames() {

    }


    public void printAreas() {
        for (MeetingRoom meetingRoom : meetingRooms) {
            System.out.println(meetingRoom.getName() + " (" + meetingRoom.getWidth() + " * " + meetingRoom.getLength() + ") területe: " + meetingRoom.getArea());
        }
    }

    public void printMeetingRoomsWithNames(String name) {
        for (MeetingRoom meetingRoom : meetingRooms) {
            if (meetingRoom.getName().contains(name)) {
                System.out.println(meetingRoom.getName() + " (" + meetingRoom.getWidth() + " * " + meetingRoom.getLength() + ") területe: " + meetingRoom.getArea());
            }

        }

    }


    public void printMeetingRoomsContains(String namefragment) {
        for (MeetingRoom meetingRoom : meetingRooms) {
            if (meetingRoom.getName().contains(namefragment)) {
                System.out.println(meetingRoom.getName() + " (" + meetingRoom.getWidth() + " * " + meetingRoom.getLength() + ") területe: " + meetingRoom.getArea());
            }

        }

    }


    public void printAreasLargerThan(int area) {
        for (MeetingRoom meetingRoom : meetingRooms) {
            if (meetingRoom.getArea() > area) {
                System.out.println(meetingRoom.getName() + " (" + meetingRoom.getWidth() + " * " + meetingRoom.getLength() + ") területe: " + meetingRoom.getArea());
            }
        }

    }


}
