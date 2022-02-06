package Abstraction.HotelReservation;

public enum Discount {
    VIP(0.2),
    SECOND_VISIT(0.1),
    NONE(0.0);

    private double disc;

    Discount(double disc) {
        this.disc = disc;
    }

    public double getDisc() {
        return disc;
    }

    public static Discount fromStringToRealDiscount(String stringDiscount) {
        switch (stringDiscount) {
            case "VIP":
                return VIP;
            case "SecondVisit":
                return SECOND_VISIT;
            case "None":
                return NONE;
            default:
                throw new IllegalArgumentException("invalid discount input");
        }
    }
}
