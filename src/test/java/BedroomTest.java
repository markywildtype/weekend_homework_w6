import org.junit.Before;
import org.junit.Test;
import rooms.Bedroom;
import rooms.Occupied;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;

    @Before
    public void before(){
        bedroom = new Bedroom(3, 314, 55);
    }

    @Test
    public void hasNightlyRate(){
        assertEquals(55, bedroom.getNightlyRate());
    }

    @Test
    public void bedroomStartsUnoccupied(){
        assertEquals(Occupied.UNOCCUPIED, bedroom.getOccupiedStatus());
    }

}
