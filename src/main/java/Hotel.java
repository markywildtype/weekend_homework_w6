import clients.Guest;
import rooms.*;

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

    public void checkInGuest(Guest guest, Room room) {
        room.addGuest(guest);
    }

    public void checkOutGuest(Guest guest, Room room) {
        room.removeGuest(guest);
    }

    public ArrayList<Guest> listGuestsInRoom(Room room) {
        return room.getGuestsCheckedIn();
    }

    public ArrayList<Room> listVacantBedrooms() {
        ArrayList<Room> vacantRooms = new ArrayList<>();
        for(Room room : bedrooms){
            if(room.getOccupiedStatus() == Occupied.UNOCCUPIED){
                vacantRooms.add(room);
            }
        }
        return vacantRooms;
    }

}
