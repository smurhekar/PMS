package main;

public class Hotel {
    private final Customer regular;
    private final Customer reward;

    public Hotel(Customer regular, Customer reward) {
        this.regular = regular;
        this.reward = reward;
    }

    private double getRateFor(boolean isWeekDay, String customerType) {
        Customer customer = getCustomerBy(customerType);
        return customer.getRateFor(isWeekDay);
    }

    private Customer getCustomerBy(String customerType) {
        return customerType.equals("Regular") ? regular : reward;
    }

    private boolean isCheaperThan(Hotel cheapestHotel, boolean isWeekDay, String customerType) {
        return getRateFor(isWeekDay, customerType) < cheapestHotel.getRateFor(isWeekDay, customerType);
    }

    public Hotel getCheaperHotel(Hotel cheapestHotel, boolean isWeekDay, String customerType) {
        if(isCheaperThan(cheapestHotel, isWeekDay, customerType)){
            return this;
        }
        return cheapestHotel;
    }
}
