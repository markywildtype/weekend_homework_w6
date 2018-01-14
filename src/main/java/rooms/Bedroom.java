package rooms;

import clients.Guest;

public class Bedroom extends Room {

    int nightlyRate;
    protected Occupancy occupancy;

    public Bedroom(int floor, int roomNumber, int nightlyRate, Occupancy occupancy) {
        super(floor, roomNumber, occupancy.getCapacity());
        this.nightlyRate = nightlyRate;
        this.occupancy = occupancy;

    }

    public int getNightlyRate() { return this.nightlyRate; }

    public void setNightlyRate(int newRate){
        this.nightlyRate = newRate;
    }

    public Occupancy getOccupancyType() {
        return this.occupancy;
    }

    public int getRoomCapacity() {
        return this.capacity;
    }

}

