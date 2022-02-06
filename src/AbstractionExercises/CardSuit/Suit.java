package AbstractionExercises.CardSuit;

import java.util.function.Consumer;

public enum Suit {
    CLUBS,
    DIAMONDS,
    HEARTS,
    SPADES;

    @Override
    public String toString() {
        return String.format("Ordinal value: %d; Name value: %s", this.ordinal(), this.name());
    }

    public static void printAllSuits() {
        Suit[] values = Suit.values();
        System.out.println("Card Suits:");
        for (Suit value : values) {
            System.out.println(value.toString());
        }
    }
}
