import org.junit.Before;
import org.junit.Test;
import rooms.ConferenceRoom;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;

    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom(0, 1, 150);
    }

    @Test
    public void hasHourlyRate(){
        assertEquals(150, conferenceRoom.getHourlyRate());
    }

}
