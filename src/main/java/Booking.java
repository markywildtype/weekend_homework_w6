import clients.Guest;
import rooms.Bedroom;

import java.util.ArrayList;


public class Booking {

    private Bedroom bedroom;
    private ArrayList<Guest> guestsBooked;
    private int nightsBooked;

    public Booking(Bedroom bedroom, int nightsBooked){
        this.guestsBooked = new ArrayList<>();
        this.bedroom = bedroom;
        this.nightsBooked = nightsBooked;
    }

    public void addGuestsToBooking(Guest guest){
        if(guestsBooked.size() < bedroom.getOccupancyType().getCapacity()) {
            guestsBooked.add(guest);
        }
    }

    public ArrayList<Guest> getGuestsBooked() {
        return this.guestsBooked;
    }

    public void activateBooking() {
        for(Guest guest : guestsBooked) {
            this.bedroom.addGuest(guest);
        }
    }

    public int getNightsBooked() {
        return this.nightsBooked;
    }

    public int getPrice() {
        int price = this.nightsBooked * bedroom.getNightlyRate();
        return price;
    }
}
