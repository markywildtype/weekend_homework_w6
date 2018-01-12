package rooms;

public class Room {

    private int floor;
    private int roomNumber;

    public Room(int floor, int roomNumber){
        this.floor = floor;
        this.roomNumber = roomNumber;
    }


    public int getFloor() {
        return this.floor;
    }
}
