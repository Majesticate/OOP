package Abstraction.HotelReservation;

public class PriceCalculator {

    private double pricePerDay;
    private int days;
    private Seasons season;
    private Discount discount;

    public PriceCalculator(double pricePerDay, int days, Seasons season, Discount discount) {
        this.pricePerDay = pricePerDay;
        this.days = days;
        this.season = season;
        this.discount = discount;
    }

    public String calculate() {
        int multiplier = season.getMultiplier();
        double disc = discount.getDisc();

        return String.format("%.2f", (pricePerDay * days * multiplier) * (1.0 - disc));
    }
}
