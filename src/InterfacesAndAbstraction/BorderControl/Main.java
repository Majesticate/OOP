package InterfacesAndAbstraction.BorderControl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Identifiable> list = new ArrayList<>();

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String[] tokens = input.split("\\s+");
            Identifiable identifiable = tokens.length == 2 ? new Robot(tokens[0], tokens[1])
                    : new Citizen(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);
            list.add(identifiable);

            input = scanner.nextLine();
        }
        String idEndWIth = scanner.nextLine();

        List<String> listOfIdentifiableThings = list.stream().
                map(Identifiable::getId).
                filter(e -> e.endsWith(idEndWIth)).collect(Collectors.toList());

        listOfIdentifiableThings.forEach(System.out::println);


    }
}
