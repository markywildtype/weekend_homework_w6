package rooms;

import clients.Guest;

public class Bedroom extends Room {

    int nightlyRate;
    private Occupancy occupancy;
    private int capacity;

    public Bedroom(int floor, int roomNumber, int nightlyRate, Occupancy occupancy) {
        super(floor, roomNumber);
        this.nightlyRate = nightlyRate;
        this.occupancy = occupancy;
        this.capacity = occupancy.getCapacity();
    }

    public int getNightlyRate() {
        return this.nightlyRate;
    }

    public Occupancy getOccupancyType() {
        return this.occupancy;
    }

    public int getRoomCapacity() {
        return this.capacity;
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
}

