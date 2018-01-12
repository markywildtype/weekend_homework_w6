package rooms;

public class ConferenceRoom extends Room {

    private int hourlyRate;

    public ConferenceRoom(int floor, int roomNumber, int hourlyRate) {
        super(floor, roomNumber);
        this.hourlyRate = hourlyRate;
    }

    public int getHourlyRate() {
        return this.hourlyRate;
    }
}
