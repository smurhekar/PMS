package main;

public class Rate {

    private final Customer regular;
    private final Customer reward;

    public Rate( Customer regular, Customer reward) {
        this.regular = regular;
        this.reward = reward;
    }

    public double getRateFor(boolean isWeekDay, String customerType) {
        if (customerType.equals("Regular")){
            return regular.getRateFor(isWeekDay);
        }else{
            return reward.getRateFor(isWeekDay);
        }
    }
}
