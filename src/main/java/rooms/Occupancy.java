package rooms;

public enum Occupancy {

    SINGLE(1),
    DOUBLE(2),
    TWIN(2);

    private final int capacity;

    Occupancy(int capacity){
        this.capacity = capacity;
    }

    public int getCapacity(){
        return this.capacity;
    }

}
