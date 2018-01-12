package rooms;

public class Room {

    private int floor;
    private int roomNumber;
    private int rate;
    private Occupied occupied = Occupied.UNOCCUPIED;

    public Room(int floor, int roomNumber, int rate){
        this.floor = floor;
        this.roomNumber = roomNumber;
        this.rate = rate;
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

    public int getRate() {
        return this.rate;
    }

    public void occupy() {
        this.occupied = Occupied.OCCUPIED;
    }
}
