package test;

import main.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ReservationSystemTest {

    @Test
    public void shouldBeAbleToFindCheapestHotelForRegularCustomerOnWeekday(){
        List<Hotel> hotels = new ArrayList<>();
        Hotel lakewood = new Hotel(new Rate(new Customer(110.0, 90.0), new Customer(80.0, 80.0)));
        Hotel bridgewood = new Hotel(new Rate(new Customer(160.0, 60.0), new Customer(110.0, 50.0)));
        Hotel ridgewood = new Hotel(new Rate(new Customer(220.0, 150.0), new Customer(100.0, 40.0)));
        hotels.add(lakewood);
        hotels.add(bridgewood);
        hotels.add(ridgewood);
        ReservationSystem reservationSystem = new ReservationSystem(hotels);
        Calendar calendar = Calendar.getInstance();
        calendar.set(2015, 10, 12);
        assertEquals(lakewood, reservationSystem.findCheapestHotelFor(new Date(), "Regular"));
    }

    @Test
    public void shouldBeAbleToFindCheapestHotelForRegularCustomerTypeOnWeekend(){
        List<Hotel> hotels = new ArrayList<>();
        Hotel lakewood = new Hotel(new Rate(new Customer(110.0, 90.0), new Customer(80.0, 80.0)));
        Hotel bridgewood = new Hotel(new Rate(new Customer(160.0, 60.0), new Customer(110.0, 50.0)));
        Hotel ridgewood = new Hotel(new Rate(new Customer(220.0, 150.0), new Customer(100.0, 40.0)));
        hotels.add(lakewood);
        hotels.add(bridgewood);
        hotels.add(ridgewood);
        ReservationSystem reservationSystem = new ReservationSystem(hotels);
        Calendar calendar = Calendar.getInstance();
        calendar.set(2015, 10, 15);
        assertEquals(bridgewood, reservationSystem.findCheapestHotelFor(calendar.getTime(), "Regular"));
    }

    @Test
    public void shouldBeAbleToFindCheapestHotelForRewardCustomerTypeOnWeekday(){
        List<Hotel> hotels = new ArrayList<>();
        Hotel lakewood = new Hotel(new Rate(new Customer(110.0, 90.0), new Customer(80.0, 80.0)));
        Hotel bridgewood = new Hotel(new Rate(new Customer(160.0, 60.0), new Customer(110.0, 50.0)));
        Hotel ridgewood = new Hotel(new Rate(new Customer(220.0, 150.0), new Customer(100.0, 40.0)));
        hotels.add(lakewood);
        hotels.add(bridgewood);
        hotels.add(ridgewood);
        ReservationSystem reservationSystem = new ReservationSystem(hotels);
        Calendar calendar = Calendar.getInstance();
        calendar.set(2015, 10, 12);
        assertEquals(lakewood, reservationSystem.findCheapestHotelFor(calendar.getTime(), "Reward"));
    }

    @Test
    public void shouldBeAbleToFindCheapestHotelForRewardCustomerTypeOnWeekend(){
        List<Hotel> hotels = new ArrayList<>();
        Hotel lakewood = new Hotel(new Rate(new Customer(110.0, 90.0), new Customer(80.0, 80.0)));
        Hotel bridgewood = new Hotel(new Rate(new Customer(160.0, 60.0), new Customer(110.0, 50.0)));
        Hotel ridgewood = new Hotel(new Rate(new Customer(220.0, 150.0), new Customer(100.0, 40.0)));
        hotels.add(lakewood);
        hotels.add(bridgewood);
        hotels.add(ridgewood);
        ReservationSystem reservationSystem = new ReservationSystem(hotels);
        Calendar calendar = Calendar.getInstance();
        calendar.set(2015, 10, 15);
        assertEquals(ridgewood, reservationSystem.findCheapestHotelFor(calendar.getTime(), "Reward"));
    }
}
