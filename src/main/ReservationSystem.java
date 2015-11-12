package main;

import java.util.List;

/**
 * Created by Lenovo on 11/10/2015.
 */
public class ReservationSystem {

    private final List<Hotel> hotels;

    public ReservationSystem(List<Hotel> hotels) {
        this.hotels = hotels;
    }

    public Hotel findCheapestHotel() {
        Hotel cheapestHotel = hotels.get(0);
        for (Hotel hotel:hotels){
            if(hotel.isCheaperThan(cheapestHotel)){
                cheapestHotel = hotel;
            }
        }
        return cheapestHotel;
    }

}
