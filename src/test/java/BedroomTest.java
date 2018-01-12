import clients.Guest;
import org.junit.Before;
import org.junit.Test;
import rooms.Bedroom;
import rooms.Occupancy;
import rooms.Occupied;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;
    Guest guest;
    Guest guest2;

    @Before
    public void before(){
        bedroom = new Bedroom(3, 314, 75, Occupancy.SINGLE);
    }

    @Test
    public void hasNightlyRate(){
        assertEquals(75, bedroom.getNightlyRate());
    }

    @Test
    public void hasOccupancyType(){
        assertEquals(Occupancy.SINGLE, bedroom.getOccupancyType());
    }

    @Test
    public void bedroomStartsUnoccupied(){
        assertEquals(Occupied.UNOCCUPIED, bedroom.getOccupiedStatus());
    }

    @Test
    public void hasCapacity(){
        assertEquals(1, bedroom.getRoomCapacity());
    }

    @Test
    public void cannotAddGuestsBeyondCapacity(){
        bedroom.addGuest(guest);
        bedroom.addGuest(guest2);
        assertEquals(1, bedroom.getGuestsCheckedIn().size());
    }

    @Test
    public void removeFinalGuestsRevertsOccupiedStatus(){
        bedroom.addGuest(guest);
        assertEquals(Occupied.OCCUPIED, bedroom.getOccupiedStatus());
        bedroom.removeGuest(guest);
        assertEquals(Occupied.UNOCCUPIED, bedroom.getOccupiedStatus());
    }

}
