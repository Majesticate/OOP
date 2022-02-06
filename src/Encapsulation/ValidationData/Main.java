package Encapsulation.ValidationData;

import Encapsulation.SortByNameAndAge.Person;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        List<Person> people = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = reader.readLine().split(" ");

            String firstName = input[0];
            String secondName = input[1];
            int age = Integer.parseInt(input[2]);
            double salary = Double.parseDouble(input[3]);
            try {
                Person person = new Person(firstName, secondName, age, salary);
                people.add(person);
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }

        }
        double bonus = Double.parseDouble(reader.readLine());

        for (Person person : people) {
            person.increaseSalary(bonus);
            System.out.printf("%s %s gets %s leva%n" ,person.getFirstName(), person.getSecondName(), person.getSalary());
        }
    }
}
