package main;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class ReservationSystem {

    private final List<Hotel> hotels;

    public ReservationSystem(List<Hotel> hotels) {
        this.hotels = hotels;
    }

    public Hotel findCheapestHotelFor(Date date) {
        boolean isWeekDay = isWeekDay(date);
        Hotel cheapestHotel = hotels.get(0);
        for (Hotel hotel:hotels){
            cheapestHotel = hotel.getCheaperHotel(cheapestHotel, isWeekDay);
        }
        return cheapestHotel;
    }

    private boolean isWeekDay(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        if(calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY){
            return false;
        }
        return true;
    }

}
