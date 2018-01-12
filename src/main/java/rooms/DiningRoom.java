package rooms;

public class DiningRoom extends Room {

    private int capacity;

    public DiningRoom(int floor, int roomNumber, int capacity) {
        super(floor, roomNumber);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return this.capacity;
    }
}
