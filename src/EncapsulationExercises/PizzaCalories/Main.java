package EncapsulationExercises.PizzaCalories;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] pizzaName = getSplitInput(scanner);

        try {
            Pizza pizza = new Pizza(pizzaName[1], Integer.parseInt(pizzaName[2]));

            String[] doughParams = getSplitInput(scanner);

            Dough dough = new Dough(doughParams[1], doughParams[2], Double.parseDouble(doughParams[3]));

            pizza.setDough(dough);

            String input = scanner.nextLine();

            int count = 0;
            while (!input.equals("END") && count != pizza.getToppings()) {

                String[] toppingElements = input.split("\\s+");

                Topping currentTopping = new Topping(toppingElements[1], Double.parseDouble(toppingElements[2]));

                pizza.addTopping(currentTopping);

                count++;
                input = scanner.nextLine();
            }

            System.out.println(pizza.toString());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }


    private static String[] getSplitInput(Scanner scanner) {
        return scanner.nextLine().split("\\s+");
    }
}
