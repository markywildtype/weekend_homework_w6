package rooms;

public class ConferenceRoom extends Room {

    private int hourlyRate;
    private String roomName;
    private int capacity;

    public ConferenceRoom(int floor, int roomNumber, int hourlyRate, String roomName, int capacity) {
        super(floor, roomNumber);
        this.hourlyRate = hourlyRate;
        this.roomName = roomName;
        this.capacity = capacity;
    }

    public int getHourlyRate() {
        return this.hourlyRate;
    }

    public String getRoomName() {
        return this.roomName;
    }

    public int getCapacity() {
        return this.capacity;
    }
}
