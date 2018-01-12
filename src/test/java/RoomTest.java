import org.junit.Before;
import org.junit.Test;
import rooms.Occupied;
import rooms.Room;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room room;

    @Before
    public void before(){
        room = new Room(2, 203);
    }

    @Test
    public void roomHasFloor(){
        assertEquals(2, room.getFloor());
    }

    @Test
    public void roomHasNumber(){
        assertEquals(203, room.getRoomNumber());
    }

    @Test
    public void roomStartsUnoccupied(){
        assertEquals(Occupied.UNOCCUPIED, room.getOccupiedStatus());
    }

    @Test
    public void roomCanBeOccupied(){
        room.occupy();
        assertEquals(Occupied.OCCUPIED, room.getOccupiedStatus());
    }


}
