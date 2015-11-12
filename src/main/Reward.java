package main;

/**
 * Created by Lenovo on 11/12/2015.
 */
public class Reward {
    private final double weekday;
    private final double weekend;

    public Reward(double weekday, double weekend) {
        this.weekday = weekday;
        this.weekend = weekend;
    }

    public double getRateFor(boolean isWeekDay) {
        return isWeekDay ? weekday : weekend;
    }
}
