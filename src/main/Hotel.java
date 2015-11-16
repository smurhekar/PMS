package main;

import java.util.HashMap;
import java.util.Map;

public class Hotel {
    final Map<String, Rate> rates;

    public Hotel(Rate regular, Rate reward) {
        rates = new HashMap<>();
        rates.put("Regular", regular);
        rates.put("Reward", reward);
    }
}
