package AbstractionExercises.CardsWithPower;

import AbstractionExercises.CardRank.Cards;
import AbstractionExercises.CardSuit.Suit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String rankCard = scanner.nextLine();
        String suitCard = scanner.nextLine();

        Cards card = Cards.getAsCard(rankCard);
        Suit suit = Suit.getAsSuit(suitCard);

        int valueOfSuitAndCard = card.getCardPower() + suit.getSuitPower();

        System.out.printf("Card name: %s of %s; Card power: %d", card.name(), suit.name(), valueOfSuitAndCard);

    }
}
