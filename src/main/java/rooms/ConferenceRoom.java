package rooms;

import clients.Guest;

public class ConferenceRoom extends Room {

    private int hourlyRate;
    private String roomName;

    public ConferenceRoom(int floor, int roomNumber, int hourlyRate, String roomName, int capacity) {
        super(floor, roomNumber, capacity);
        this.hourlyRate = hourlyRate;
        this.roomName = roomName;
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

    public void setHourlyRate(int newRate) {
        this.hourlyRate = newRate;
    }
}
