import clients.Guest;
import rooms.Bedroom;
import rooms.ConferenceRoom;
import rooms.DiningRoom;

import java.util.ArrayList;

public class Hotel {

    private String name;
    private int floors;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private ArrayList<DiningRoom> diningRooms;

    public Hotel(String name, int floors){
        this.name = name;
        this.floors = floors;
        this.bedrooms = new ArrayList<>();
        this.bedrooms = new ArrayList<>();
        this.conferenceRooms = new ArrayList<>();
        this.diningRooms = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public int getFloors() {
        return this.floors;
    }

    public void addBedroom(Bedroom bedroom) {
        this.bedrooms.add(bedroom);
    }

    public ArrayList<Bedroom> getBedrooms() {
        return this.bedrooms;
    }

    public void addConferenceRoom(ConferenceRoom conferenceRoom) {
        this.conferenceRooms.add(conferenceRoom);
    }

    public ArrayList<ConferenceRoom> getConferenceRooms() {
        return this.conferenceRooms;
    }

    public void addDiningRoom(DiningRoom diningRoom) {
        this.diningRooms.add(diningRoom);
    }

    public ArrayList<DiningRoom> getDiningRooms() {
        return this.diningRooms;
    }

    public void checkInGuestBedroom(Guest guest, Bedroom bedroom) {
        bedroom.addGuest(guest);
    }
}
