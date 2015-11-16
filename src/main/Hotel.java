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

    public double getRateFor(String rateType, boolean isWeekDay){
        return rates.get(rateType).when(isWeekDay);
    }
}
