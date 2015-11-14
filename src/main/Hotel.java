package main;

import java.util.HashMap;
import java.util.Map;

public class Hotel {
    private final Map<String, Rate> rates;

    public Hotel(Rate regular, Rate reward) {
        rates = new HashMap<>();
        rates.put("Regular", regular);
        rates.put("Reward", reward);
    }

    private double getRateFor(boolean isWeekDay, String rateType) {
        return getCustomerBy(rateType).getRateFor(isWeekDay);
    }

    private Rate getCustomerBy(String rateType) {
        return rates.get(rateType);
    }

    private boolean isCheaperThan(Hotel cheapestHotel, boolean isWeekDay, String rateType) {
        return getRateFor(isWeekDay, rateType) < cheapestHotel.getRateFor(isWeekDay, rateType);
    }

    public Hotel compareWith(Hotel cheapestHotel, boolean isWeekDay, String rateType) {
        if(isCheaperThan(cheapestHotel, isWeekDay, rateType)){
            return this;
        }
        return cheapestHotel;
    }
}
