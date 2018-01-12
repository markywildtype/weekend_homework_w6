package rooms;

import clients.Guest;

import java.util.ArrayList;

public class Room {

    private int floor;
    private int roomNumber;
    protected Occupied occupied = Occupied.UNOCCUPIED;
    protected ArrayList<Guest> guestsCheckedIn = new ArrayList<>();
    protected int capacity;

    public Room(int floor, int roomNumber, int capacity){
        this.floor = floor;
        this.roomNumber = roomNumber;
        this.capacity = capacity;
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
        if(guestsCheckedIn.size() < this.capacity)
            this.guestsCheckedIn.add(guest);
        occupy();
    }

    public void removeGuest(Guest guest) {
        this.guestsCheckedIn.remove(guest);
        if(guestsCheckedIn.size() == 0){
            this.occupied = Occupied.UNOCCUPIED;
        }
    }

    public ArrayList<Guest> getGuestsCheckedIn() {
        return this.guestsCheckedIn;
    }

    public void removeAllGuests() {
        this.guestsCheckedIn.clear();
        this.occupied = Occupied.UNOCCUPIED;

    }
}
