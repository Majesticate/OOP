package InterfacesAndAbstractionExercises.FoodShortage;

import InterfacesAndAbstractionExercises.DefineAnInterfacePerson.Citizen;
import InterfacesAndAbstractionExercises.DefineAnInterfacePerson.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> list = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String name = tokens[0];
            int age = Integer.parseInt(tokens[1]);
            Person citizen = tokens.length == 4 ?
                    new Citizen(name, age, tokens[2], tokens[3]) :
                    new Rebel(name, age, tokens[2]);
            list.add(citizen);

        }

        String name = scanner.nextLine();
        while (!name.equals("End")) {
            String finalName = name;

   //         List<PersonImpl> collect = list.stream().filter(person -> person.getName().equals(finalName)).collect(Collectors.toList());
     //       if (!collect.isEmpty()){
    //            collect.forEach(PersonImpl::buyFood);
            }
            name = scanner.nextLine();
        }

        //int sumOfPurchaseFood = list.stream().mapToInt(PersonImpl::getFood).sum();
       // System.out.println(sumOfPurchaseFood);

    }

