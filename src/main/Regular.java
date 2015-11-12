package main;

/**
 * Created by Lenovo on 11/12/2015.
 */
public class Regular {
    private final double weekday;
    private final double weekend;

    public Regular(double weekday, double weekend) {
        this.weekday = weekday;
        this.weekend = weekend;
    }

    public double getRateFor(boolean isWeekDay) {
        return isWeekDay ? weekday : weekend;
    }
}
