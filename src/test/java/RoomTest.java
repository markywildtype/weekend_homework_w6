import clients.Guest;
import org.junit.Before;
import org.junit.Test;
import rooms.Occupancy;
import rooms.Occupied;
import rooms.Room;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room room;
    Guest guest;
    Guest guest2;

    @Before
    public void before(){
        room = new Room(2, 203, 2);
        guest = new Guest("Jim Matherson");
        guest2 = new Guest("Kirstyn Knowles");
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

    @Test
    public void canAddGuest(){
        room.addGuest(guest);
        assertEquals(1, room.getGuestsCheckedIn().size());
        assertEquals(Occupied.OCCUPIED, room.getOccupiedStatus());

    }

    @Test
    public void canRemoveGuest(){
        room.addGuest(guest);
        room.addGuest(guest2);
        room.removeGuest(guest);
        assertEquals(1, room.getGuestsCheckedIn().size());
    }

    @Test
    public void canRemoveAllGuests(){
        room.addGuest(guest);
        room.addGuest(guest2);
        room.removeAllGuests();
        assertEquals(0, room.getGuestsCheckedIn().size());
        assertEquals(Occupied.UNOCCUPIED, room.getOccupiedStatus());

    }

}
