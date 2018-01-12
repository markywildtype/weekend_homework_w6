import org.junit.Before;
import org.junit.Test;
import rooms.Bedroom;
import rooms.Occupancy;
import rooms.Occupied;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;

    @Before
    public void before(){
        bedroom = new Bedroom(3, 314, 55, Occupancy.SINGLE);
    }

    @Test
    public void hasNightlyRate(){
        assertEquals(55, bedroom.getNightlyRate());
    }

    @Test
    public void hasOccupancyType(){
        assertEquals(Occupancy.SINGLE, bedroom.getOccupancyType());
    }

    @Test
    public void bedroomStartsUnoccupied(){
        assertEquals(Occupied.UNOCCUPIED, bedroom.getOccupiedStatus());
    }

}
