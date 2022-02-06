package Abstraction.HotelReservation;

public enum Seasons {
    AUTUMN(1),
    SPRING(2),
    WINTER(3),
    SUMMER(4);

    private int multiplier;

    Seasons(int multiplied) {
        this.multiplier = multiplied;
    }

    public int getMultiplier() {
        return multiplier;
    }

    public static Seasons toSeason(String fromStringSeason){
        switch (fromStringSeason) {
            case "Summer":
                return SUMMER;
            case "Spring":
                return SPRING;
            case "Winter":
                return WINTER;
            case "Autumn":
                return AUTUMN;
            default:
                throw new IllegalArgumentException("unknown season ");
        }
    }
}
