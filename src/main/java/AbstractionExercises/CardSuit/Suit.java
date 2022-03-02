package AbstractionExercises.CardSuit;

public enum Suit {
    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);

    int suitPower;

    Suit(int suitPower) {
        this.suitPower = suitPower;
    }

    public int getSuitPower() {
        return suitPower;
    }

    @Override
    public String toString() {
        return String.format("Ordinal value: %d; Name value: %s", this.ordinal(), this.name());
    }

    public static void printAllSuits() {
        System.out.println("Card Suits:");
        Suit[] values = Suit.values();
        for (Suit value : values) {
            System.out.println(value.toString());
        }
    }

    public static Suit getAsSuit(String suitAsString) {
        return Suit.valueOf(suitAsString.toUpperCase());
    }
}
