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
        //Given
        List<Hotel> hotels = new ArrayList<>();
        Hotel lakewood = new Hotel(new Customer(110.0, 90.0), new Customer(80.0, 80.0));
        Hotel bridgewood = new Hotel(new Customer(160.0, 60.0), new Customer(110.0, 50.0));
        Hotel ridgewood = new Hotel(new Customer(220.0, 150.0), new Customer(100.0, 40.0));
        hotels.add(lakewood);
        hotels.add(bridgewood);
        hotels.add(ridgewood);
        //When
        ReservationSystem reservationSystem = new ReservationSystem(hotels);
        Calendar calendar = Calendar.getInstance();
        calendar.set(2015, 10, 12);
        //Then
        assertEquals(lakewood, reservationSystem.findCheapestHotelFor(new Date(), "Regular"));
    }

    @Test
    public void shouldBeAbleToFindCheapestHotelForRegularCustomerTypeOnWeekend(){
        //Given
        List<Hotel> hotels = new ArrayList<>();
        Hotel lakewood = new Hotel(new Customer(110.0, 90.0), new Customer(80.0, 80.0));
        Hotel bridgewood = new Hotel(new Customer(160.0, 60.0), new Customer(110.0, 50.0));
        Hotel ridgewood = new Hotel(new Customer(220.0, 150.0), new Customer(100.0, 40.0));
        hotels.add(lakewood);
        hotels.add(bridgewood);
        hotels.add(ridgewood);
        //When
        ReservationSystem reservationSystem = new ReservationSystem(hotels);
        Calendar calendar = Calendar.getInstance();
        calendar.set(2015, 10, 15);
        //Then
        assertEquals(bridgewood, reservationSystem.findCheapestHotelFor(calendar.getTime(), "Regular"));
    }

    @Test
    public void shouldBeAbleToFindCheapestHotelForRewardCustomerTypeOnWeekday(){
        //Given
        List<Hotel> hotels = new ArrayList<>();
        Hotel lakewood = new Hotel(new Customer(110.0, 90.0), new Customer(80.0, 80.0));
        Hotel bridgewood = new Hotel(new Customer(160.0, 60.0), new Customer(110.0, 50.0));
        Hotel ridgewood = new Hotel(new Customer(220.0, 150.0), new Customer(100.0, 40.0));
        hotels.add(lakewood);
        hotels.add(bridgewood);
        hotels.add(ridgewood);
        //When
        ReservationSystem reservationSystem = new ReservationSystem(hotels);
        Calendar calendar = Calendar.getInstance();
        calendar.set(2015, 10, 12);
        //Then
        assertEquals(lakewood, reservationSystem.findCheapestHotelFor(calendar.getTime(), "Reward"));
    }

    @Test
    public void shouldBeAbleToFindCheapestHotelForRewardCustomerTypeOnWeekend(){
        //Given
        List<Hotel> hotels = new ArrayList<>();
        Hotel lakewood = new Hotel(new Customer(110.0, 90.0), new Customer(80.0, 80.0));
        Hotel bridgewood = new Hotel(new Customer(160.0, 60.0), new Customer(110.0, 50.0));
        Hotel ridgewood = new Hotel(new Customer(220.0, 150.0), new Customer(100.0, 40.0));
        hotels.add(lakewood);
        hotels.add(bridgewood);
        hotels.add(ridgewood);
        //When
        ReservationSystem reservationSystem = new ReservationSystem(hotels);
        Calendar calendar = Calendar.getInstance();
        calendar.set(2015, 10, 15);
        //Then
        assertEquals(ridgewood, reservationSystem.findCheapestHotelFor(calendar.getTime(), "Reward"));
    }
}
