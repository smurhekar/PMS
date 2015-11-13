package main;

public class Customer {
    private final double weekday;
    private final double weekend;

    public Customer(double weekday, double weekend) {
        this.weekday = weekday;
        this.weekend = weekend;
    }

    public double getRateFor(boolean isWeekDay) {
        return isWeekDay ? weekday : weekend;
    }
}
