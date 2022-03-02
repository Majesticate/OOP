package InheritanceExercises.animals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Animal> animals = new ArrayList<>();

        String input = scanner.nextLine();

        while (!input.equals("Beast!")) {
            String[] tokens = scanner.nextLine().split("\\s+");
            if (Integer.parseInt(tokens[1]) < 0) {
                System.out.println("Invalid input!");
                input = scanner.nextLine();
                continue;
            }

            switch (input) {
                case "Dog":
                    Dog dog = new Dog(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);
                    animals.add(dog);
                    break;
                case "Cat":
                    Cat cat = new Cat(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);
                    animals.add(cat);
                    break;
                case "Frog":
                    Frog frog = new Frog(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);
                    animals.add(frog);
                    break;
                case "Kitten":
                    Kitten kitten = new Kitten(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);
                    animals.add(kitten);
                    break;
                case "Tomcat":
                    Tomcat tomcat = new Tomcat(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);
                    animals.add(tomcat);
                    break;
                default:
                    System.out.println("Invalid input!.");

            }
            input = scanner.nextLine();
        }
        animals.forEach(e -> System.out.println(e.toString()));

    }
}
