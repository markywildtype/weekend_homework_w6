import org.junit.Before;
import org.junit.Test;
import rooms.ConferenceRoom;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;

    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom(0, 1, 150, "The White Room", 200);
    }

    @Test
    public void hasHourlyRate(){
        assertEquals(150, conferenceRoom.getHourlyRate());
    }

    @Test
    public void hasRoomName(){
        assertEquals("The White Room", conferenceRoom.getRoomName());
    }

    @Test
    public void hasCapacity(){
        assertEquals(200, conferenceRoom.getCapacity());
    }

}
