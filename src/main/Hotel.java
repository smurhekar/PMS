package main;

public class Hotel {
    private final Rate rate;

    public Hotel(Rate rate) {
        this.rate = rate;
    }

    private boolean isCheaperThan(Hotel cheapestHotel, boolean isWeekDay, String customerType) {
        return rate.getRateFor(isWeekDay, customerType) < cheapestHotel.rate.getRateFor(isWeekDay, customerType);
    }

    public Hotel getCheaperHotel(Hotel cheapestHotel, boolean isWeekDay, String customerType) {
        if(isCheaperThan(cheapestHotel, isWeekDay, customerType)){
            return this;
        }
        return cheapestHotel;
    }
}
