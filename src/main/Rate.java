package main;

public class Rate {


    private final Regular regular;
    private final Reward reward;

    public Rate( Regular regular, Reward reward) {
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
