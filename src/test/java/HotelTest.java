import clients.Guest;
import org.junit.Before;
import org.junit.Test;
import rooms.Bedroom;
import rooms.ConferenceRoom;
import rooms.DiningRoom;
import rooms.Occupancy;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Bedroom bedroom;
    Bedroom bedroom2;
    ConferenceRoom conf1;
    DiningRoom dining1;
    DiningRoom dining2;
    Guest guest;
    Guest guest2;

    @Before
    public void before(){
        hotel = new Hotel("Hotel California", 6);
        bedroom = new Bedroom(1, 101, 105, Occupancy.DOUBLE);
        bedroom2 = new Bedroom(1, 102, 65, Occupancy.SINGLE);
        conf1 = new ConferenceRoom(0, 1, 250, "Glenmorangie", 300);
        dining1 = new DiningRoom(0, 2,150);
        dining2 = new DiningRoom(1, 201,100);
        guest = new Guest("Mark Blanford");
        guest2 = new Guest("Aline Nardo");
    }

    @Test
    public void hasName(){
        assertEquals("Hotel California", hotel.getName());
    }

    @Test
    public void hasFloors(){
        assertEquals(6, hotel.getFloors());
    }

    @Test
    public void hasBedrooms(){
        hotel.addBedroom(bedroom);
        hotel.addBedroom(bedroom2);
        assertEquals(2, hotel.getBedrooms().size());
    }

    @Test
    public void hasConferenceRooms(){
        hotel.addConferenceRoom(conf1);
        assertEquals(1, hotel.getConferenceRooms().size());
    }

    @Test
    public void hasDiningRooms(){
        hotel.addDiningRoom(dining1);
        hotel.addDiningRoom(dining2);
        assertEquals(2, hotel.getDiningRooms().size());
    }

    @Test
    public void canCheckInGuests(){
        hotel.addBedroom(bedroom);
        hotel.checkInGuestRoom(guest, bedroom);
        hotel.checkInGuestRoom(guest2, bedroom);
        assertEquals(2, bedroom.getGuestsCheckedIn().size());
    }

    @Test
    public void canListGuestsInRoom(){
        hotel.addBedroom(bedroom);
        hotel.checkInGuestRoom(guest, bedroom);
        ArrayList guestList = hotel.listGuestsInRoom(bedroom);
        assertEquals(guest, guestList.get(0));
    }
}
