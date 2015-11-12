package main;

/**
 * Created by Lenovo on 11/10/2015.
 */
public class Hotel {
    private final double rate;

    public Hotel(double rate) {
        this.rate = rate;
    }

    public boolean isCheaperThan(Hotel cheapestHotel) {
        return this.rate < cheapestHotel.rate;
    }


}
