package rooms;

public class Room {

    private int floor;
    private int roomNumber;
    private Occupied occupied;

    public Room(int floor, int roomNumber){
        this.floor = floor;
        this.roomNumber = roomNumber;
        this.occupied = Occupied.UNOCCUPIED;
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


}
