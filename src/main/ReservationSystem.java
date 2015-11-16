package main;

import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class ReservationSystem {

    private final List<Hotel> hotels;

    public ReservationSystem(List<Hotel> hotels) {
        this.hotels = hotels;
    }

    public Hotel findCheapestHotelFor(Date date, String customerType) {
        boolean isWeekDay = isWeekDay(date);
        Collections.sort(hotels, new HotelComparator(isWeekDay, customerType));
        return hotels.get(0);
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
