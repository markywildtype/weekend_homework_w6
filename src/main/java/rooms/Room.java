package rooms;

public class Room {

    private int floor;
    private int roomNumber;
    private Occupied occupied = Occupied.UNOCCUPIED;

    public Room(int floor, int roomNumber){
        this.floor = floor;
        this.roomNumber = roomNumber;
    }

    public int getFloor() {
        return this.floor;
    }

    public int getRoomNumber() {
        return this.roomNumber;
    }

    public Occupied getOccupiedStatus() {
        return this.occupied;
    }

    public void occupy() {
        this.occupied = Occupied.OCCUPIED;
    }
}
