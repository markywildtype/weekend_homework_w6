import clients.Guest;
import org.junit.Before;
import org.junit.Test;
import rooms.*;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Bedroom bedroom;
    Bedroom bedroom2;
    Bedroom bedroom3;
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
        bedroom3 = new Bedroom(2, 202, 58, Occupancy.SINGLE);
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
        hotel.checkInGuest(guest, bedroom);
        hotel.checkInGuest(guest2, bedroom);
        assertEquals(2, bedroom.getGuestsCheckedIn().size());
    }

    @Test
    public void canCheckOutGuests(){
        hotel.addConferenceRoom(conf1);
        hotel.checkInGuest(guest, conf1);
        hotel.checkInGuest(guest2, conf1);
        assertEquals(2, conf1.getGuestsCheckedIn().size());
        hotel.checkOutGuest(guest, conf1);
        assertEquals(1, conf1.getGuestsCheckedIn().size());
        hotel.checkOutGuest(guest2, conf1);
        assertEquals(0, conf1.getGuestsCheckedIn().size());
        assertEquals(Occupied.UNOCCUPIED, conf1.getOccupiedStatus());
    }

    @Test
    public void canCheckOutAllGuests(){
        hotel.addConferenceRoom(conf1);
        hotel.checkInGuest(guest, conf1);
        hotel.checkInGuest(guest2, conf1);
        hotel.checkOutAllGuests(conf1);
        assertEquals(0, conf1.getGuestsCheckedIn().size());
    }

    @Test
    public void canListGuestsInRoom(){
        hotel.addBedroom(bedroom);
        hotel.checkInGuest(guest, bedroom);
        ArrayList guestList = hotel.listGuestsInRoom(bedroom);
        assertEquals(guest, guestList.get(0));
    }

    @Test
    public void canListVacantRooms(){
        hotel.addBedroom(bedroom);
        hotel.addBedroom(bedroom2);
        hotel.addBedroom(bedroom3);
        hotel.checkInGuest(guest, bedroom3);
        assertEquals(2, hotel.listVacantBedrooms().size());
    }

    @Test
    public void canCreateBooking(){
        hotel.createBooking(bedroom, 5);
        assertEquals(1, hotel.getBookings().size());
    }

    @Test
    public void canGetBookingPrice(){
        Booking booking = hotel.createBooking(bedroom, 5);
        assertEquals(525, hotel.getBookingPrice(booking));
    }

    @Test
    public void canAddGuestsToBooking(){
        Booking booking = hotel.createBooking(bedroom, 3);
        hotel.addGuestToBooking(guest, booking);
        hotel.addGuestToBooking(guest2, booking);
        assertEquals(2, hotel.getBookings().get(0).getGuestsBooked().size());
    }

    @Test
    public void canActivateBooking(){
        Booking booking = hotel.createBooking(bedroom, 3);
        hotel.addGuestToBooking(guest, booking);
        hotel.addGuestToBooking(guest2, booking);
        hotel.activateBooking(booking);
        assertEquals(2, bedroom.getGuestsCheckedIn().size());
    }



    //make a version of the following test:
//
//    @Test
//    public void cannotDoubleBookRoom(){
//        booking.addGuestsToBooking(guest);
//        booking2 = new Booking(bedroom, 3);
//        assertEquals(5, booking.getNightsBooked());
//    }

}
