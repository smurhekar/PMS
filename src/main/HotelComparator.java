package main;

import java.util.Comparator;

public class HotelComparator implements Comparator<Hotel> {
    private final boolean isWeekDay;
    private final String rateType;

    public HotelComparator(boolean isWeekDay, String rateType) {
        this.isWeekDay = isWeekDay;
        this.rateType = rateType;
    }

    @Override
    public int compare(Hotel h1, Hotel h2) {
        double rateForH1 = h1.rates.get(rateType).getRateFor(isWeekDay);
        double rateForH2 = h2.rates.get(rateType).getRateFor(isWeekDay);
        if(rateForH1 == rateForH2){
            return 0;
        }else if(rateForH1 > rateForH2){
            return 1;
        }
        return -1;
    }
}
