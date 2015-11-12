package test;

import main.Hotel;
import main.Rate;
import main.ReservationSystem;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by Lenovo on 11/10/2015.
 */
public class ReservationSystemTest {

    @Test
    public void shouldBeAbleToFindCheapestHotel(){
        List<Hotel> hotels = new ArrayList<>();
        Hotel lakewood = new Hotel(110.0);
        Hotel bridgewood = new Hotel(160.0);
        Hotel ridgewood = new Hotel(100.0);
        hotels.add(lakewood);
        hotels.add(bridgewood);
        hotels.add(ridgewood);
        ReservationSystem reservationSystem = new ReservationSystem(hotels);
        assertEquals(ridgewood, reservationSystem.findCheapestHotel());
    }

    /*@Test
    public void shouldBeAbleToFindCheapestHotelForWeekdayRates(){
        List<Hotel> hotels = new ArrayList<>();
        Hotel lakewood = new Hotel(new Rate(110.0, 90.0));
        Hotel bridgewood = new Hotel(new Rate(160.0, 60.0));
        Hotel ridgewood = new Hotel(new Rate(100.0, 150.0));
        hotels.add(lakewood);
        hotels.add(bridgewood);
        hotels.add(ridgewood);
        ReservationSystem reservationSystem = new ReservationSystem(hotels);
    }*/


}
