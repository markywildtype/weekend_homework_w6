package rooms;

public class DiningRoom extends Room {

    public DiningRoom(int floor, int roomNumber, int capacity) {
        super(floor, roomNumber, capacity);
    }

    public int getCapacity() {
        return this.capacity;
    }
}
