import org.junit.Before;
import org.junit.Test;
import rooms.DiningRoom;
import rooms.Occupied;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    DiningRoom diningRoom;

    @Before
    public void before(){
        diningRoom = new DiningRoom(0, 5, 150);
    }

    @Test
    public void startsUnoccupied(){
        assertEquals(Occupied.UNOCCUPIED, diningRoom.getOccupiedStatus());
    }

    @Test
    public void hasCapacity(){
        assertEquals(150, diningRoom.getCapacity());
    }
}
