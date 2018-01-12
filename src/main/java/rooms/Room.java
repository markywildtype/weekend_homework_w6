package rooms;

import clients.Guest;

import java.util.ArrayList;

public class Room {

    private int floor;
    private int roomNumber;
    protected Occupied occupied = Occupied.UNOCCUPIED;
    protected ArrayList<Guest> guestsCheckedIn = new ArrayList<Guest>();

    public Room(int floor, int roomNumber){
        this.floor = floor;
        this.roomNumber = roomNumber;
    }

    public int getFloor() {
        return this.floor;
    }

    public int getRoomNumber() {
        return this.roomNumber;
    }

    public Occupied getOccupiedStatus() {
        return this.occupied;
    }

    public void occupy() {
        this.occupied = Occupied.OCCUPIED;
    }

    public void addGuest(Guest guest) {
        this.guestsCheckedIn.add(guest);
        occupy();
    }

    public void removeGuest(Guest guest) {
        this.guestsCheckedIn.remove(guest);
    }

    public ArrayList<Guest> getGuestsCheckedIn() {
        return this.guestsCheckedIn;
    }

    public void removeAllGuests() {
        this.guestsCheckedIn.clear();
        this.occupied = Occupied.UNOCCUPIED;

    }
}
