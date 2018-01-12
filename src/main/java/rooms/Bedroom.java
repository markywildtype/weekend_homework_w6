package rooms;

public class Bedroom extends Room {

    int nightlyRate;
    private Occupancy occupancy;

    public Bedroom(int floor, int roomNumber, int nightlyRate, Occupancy occupancy) {
        super(floor, roomNumber);
        this.nightlyRate = nightlyRate;
        this.occupancy = occupancy;
    }

    public int getNightlyRate() {
        return this.nightlyRate;
    }

    public Occupancy getOccupancyType() {
        return this.occupancy;
    }
}

