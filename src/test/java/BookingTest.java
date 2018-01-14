import clients.Guest;
import org.junit.Before;
import org.junit.Test;
import rooms.Bedroom;
import rooms.Occupancy;
import rooms.Occupied;
import rooms.Room;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    Hotel hotel;
    Booking booking;
    Booking booking2;
    Bedroom bedroom;
    Guest guest;
    Guest guest2;
    ArrayList<Guest> guestsBooked;

    @Before
    public void before(){
        hotel = new Hotel("The Grand Budapest Hotel", 6);
        bedroom = new Bedroom(3, 308, 47, Occupancy.SINGLE);
        guest = new Guest("Cedric Diggory");
        guest2 = new Guest("Cho Chang");
        booking = new Booking(bedroom, 5);
    }

    @Test
    public void canAddGuestsToBooking(){
        booking.addGuestsToBooking(guest);
        assertEquals(1, booking.getGuestsBooked().size());
    }

    @Test
    public void hasNumberOfNights(){
        booking.addGuestsToBooking(guest);
        assertEquals(5, booking.getNightsBooked());
    }

    @Test
    public void booksGuests(){
        booking.addGuestsToBooking(guest);
        assertEquals(1, booking.getGuestsBooked().size());
    }

    @Test
    public void cannotOverbookRoom(){
        booking.addGuestsToBooking(guest);
        booking.addGuestsToBooking(guest2);
        assertEquals(1, booking.getGuestsBooked().size());
    }

    @Test
    public void canActivateBooking(){
        booking.addGuestsToBooking(guest);
        booking.activateBooking();
        assertEquals(Occupied.OCCUPIED, bedroom.getOccupiedStatus());
    }

    //the following test should be in Hotel:

    @Test
    public void cannotDoubleBookRoom(){
        booking.addGuestsToBooking(guest);
        booking2 = new Booking(bedroom, 3);
        assertEquals(5, booking.getNightsBooked());
    }


}
