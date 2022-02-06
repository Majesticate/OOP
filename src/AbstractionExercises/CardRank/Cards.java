package AbstractionExercises.CardRank;

public enum Cards {
    ACE,
    TWO,
    THREE,
    FOUR,
    FIVE,
    SIX,
    SEVEN,
    EIGHT,
    NINE,
    TEN,
    JACK,
    QUEEN,
    KING;

    @Override
    public String toString() {
        return String.format("Ordinal value: %d; Name value: %s", this.ordinal(), this.name());
    }

    public static void printAllCards(){
        System.out.println("Card Ranks:");
        Cards[] values = Cards.values();
        for (Cards value : values) {
            System.out.println(value.toString());
        }
    }
}
