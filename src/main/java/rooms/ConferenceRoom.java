package rooms;

public class ConferenceRoom extends Room {

    private int hourlyRate;
    private String roomName;

    public ConferenceRoom(int floor, int roomNumber, int hourlyRate, String roomName) {
        super(floor, roomNumber);
        this.hourlyRate = hourlyRate;
        this.roomName = roomName;
    }

    public int getHourlyRate() {
        return this.hourlyRate;
    }

    public String getRoomName() {
        return this.roomName;
    }
}
