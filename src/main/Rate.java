package main;

public class Rate {
    private final double weekday;
    private final double weekend;

    public Rate(double weekday, double weekend) {
        this.weekday = weekday;
        this.weekend = weekend;
    }

    public double getRateFor(boolean isWeekDay) {
        return isWeekDay ? weekday : weekend;
    }
}
