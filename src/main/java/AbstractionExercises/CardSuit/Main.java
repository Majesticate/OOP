package AbstractionExercises.CardSuit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        if (input.equals("Card Suits")) {
            Suit.printAllSuits();
        }
    }
}
