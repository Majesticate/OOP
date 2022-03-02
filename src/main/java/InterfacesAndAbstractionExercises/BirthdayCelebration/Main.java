package InterfacesAndAbstractionExercises.BirthdayCelebration;

import InterfacesAndAbstractionExercises.DefineAnInterfacePerson.Citizen;
import InterfacesAndAbstractionExercises.MultipleImplementation.Birthable;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Birthable> list = new ArrayList<>();

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] tokens = input.split("\\s+");

            if (tokens.length == 5) {
                Birthable person = new Citizen(tokens[1], Integer.parseInt(tokens[2]), tokens[3], tokens[4]);
                list.add(person);
            } else if (tokens[0].equals("Pet")) {
                Birthable pet = new Pet(tokens[1], tokens[2]);
                list.add(pet);
            }

            input = scanner.nextLine();
        }

        String year = scanner.nextLine();;
        list.stream().filter(e -> e.getBirthDate().contains(year))
                .forEach(e -> System.out.println(e.getBirthDate()));
    }
}
