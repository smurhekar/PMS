package main;

import java.util.Comparator;

public class HotelRateComparator implements Comparator<Hotel> {
    private final boolean isWeekDay;
    private final String rateType;

    public HotelRateComparator(boolean isWeekDay, String rateType) {
        this.isWeekDay = isWeekDay;
        this.rateType = rateType;
    }

    @Override
    public int compare(Hotel h1, Hotel h2) {
        double rateForH1 = h1.getRateFor(rateType, isWeekDay);
        double rateForH2 = h2.getRateFor(rateType, isWeekDay);
        if(rateForH1 == rateForH2){
            return 0;
        }else if(rateForH1 > rateForH2){
            return 1;
        }
        return -1;
    }
}
