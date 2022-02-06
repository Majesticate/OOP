package AbstractionExercises.TrafficLights;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedList<String> linkedList = new LinkedList<>(Arrays.asList(scanner.nextLine().split("\\s+")));

        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {
            LinkedList<Lights> fromStringToLights = Lights.allStingToLights(linkedList);

            LinkedList<Lights> convertToNextLight = Lights.convertToNextLight(fromStringToLights);

            linkedList = Lights.convertFromLightToString(convertToNextLight);

            convertToNextLight.forEach(e -> System.out.print(e + " "));
            System.out.println();
        }


    }


}
