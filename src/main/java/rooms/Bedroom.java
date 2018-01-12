package rooms;

public class Bedroom extends Room {

    int nightlyRate;

    public Bedroom(int floor, int roomNumber, int nightlyRate) {
        super(floor, roomNumber);
        this.nightlyRate = nightlyRate;
    }

    public int getNightlyRate() {
        return this.nightlyRate;
    }
}

