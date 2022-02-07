package EncapsulationExercises;

import EncapsulationExercises.ShoppingSpree.Person;
import EncapsulationExercises.ShoppingSpree.Product;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = scanner.nextLine().split(";");
        String[] products = scanner.nextLine().split(";");

        Map<Integer, Person> personMap = new LinkedHashMap<>();
        Map<Integer, Product> productMap = new LinkedHashMap<>();

        getAllPeopleAndTheirMoney(personMap, names);

        getAllProductAndPrices(productMap, products);

        String input = scanner.nextLine();

        while (!input.equals("END")) {
            String[] tokens = input.split("\\s+");
            String nameOfPerson = tokens[0];
            String nameOfProduct = tokens[1];

            List<Person> getPerson = personMap.values()
                    .stream().filter(e -> e.getName()
                            .equals(nameOfPerson))
                    .collect(Collectors.toList());
            List<Product> getProduct = productMap.values()
                    .stream().filter(e -> e.getName()
                            .equals(nameOfProduct))
                    .collect(Collectors.toList());

            if (!getPerson.isEmpty()) {
                getPerson.get(0).buyProduct(getProduct.get(0));
            }

            input = scanner.nextLine();
        }

        personMap.values().stream()
                .map(Person::toString)
                .forEach(System.out::println);

    }

    private static void getAllProductAndPrices(Map<Integer, Product> listOfProduct, String[] products) {
        int count = 0;
        for (String name : products) {
            String[] tokens = name.split("=");
            try {
                Product newProduct = new Product(tokens[0], Double.parseDouble(tokens[1]));
                listOfProduct.put(count, newProduct);
                count++;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void getAllPeopleAndTheirMoney(Map<Integer, Person> listOfPeople, String[] names) {
        int count = 0;
        for (String name : names) {
            String[] tokens = name.split("=");
            try {
                Person newPerson = new Person(tokens[0], Double.parseDouble(tokens[1]));
                listOfPeople.put(count, newPerson);
                count++;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
