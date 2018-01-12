import org.junit.Before;
import org.junit.Test;
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

}
