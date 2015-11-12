package main;

public class Hotel {
    private final Rate rate;

    public Hotel(Rate rate) {
        this.rate = rate;
    }

    private boolean isCheaperThan(Hotel cheapestHotel, boolean isWeekDay) {
        return rate.getRateFor(isWeekDay) < cheapestHotel.rate.getRateFor(isWeekDay);
    }

    public Hotel getCheaperHotel(Hotel cheapestHotel, boolean isWeekDay) {
        if(isCheaperThan(cheapestHotel, isWeekDay)){
            return this;
        }
        return cheapestHotel;
    }
}
