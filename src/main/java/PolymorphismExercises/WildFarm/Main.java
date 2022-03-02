package PolymorphismExercises.WildFarm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            Animal animal = null;
            String[] tokensOfAnimal = input.split("\\s+");

            String animalType = tokensOfAnimal[0];
            String nameOfAnimal = tokensOfAnimal[1];
            Double weightOfAnimal = Double.parseDouble(tokensOfAnimal[2]);
            String livingRegion = tokensOfAnimal[3];

            String[] tokensOfFood = scanner.nextLine().split("\\s+");

            String typeOfFood = tokensOfFood[0];
            Integer foodQuantity = Integer.parseInt(tokensOfFood[1]);

            Food food = new Food(typeOfFood, foodQuantity);

            if (tokensOfAnimal.length == 4) {
                if (animalType.equals("Zebra")) {
                    animal = new Zebra(animalType, nameOfAnimal, weightOfAnimal, livingRegion);
                    isVegetableEater(animal, animalType, food);
                } else if (animalType.equals("Mouse")) {
                    animal = new Mouse(animalType, nameOfAnimal, weightOfAnimal, livingRegion);
                    isVegetableEater(animal, animalType, food);
                } else if (animalType.equals("Tiger")) {
                    animal = new Tiger(animalType, nameOfAnimal, weightOfAnimal, livingRegion);
                    if (food.getFoodType().equals("Meat")) {
                        animal.setFoodEaten(food.getQuantity());
                    }
                }
            } else if (tokensOfAnimal.length == 5) {
                String breed = tokensOfAnimal[4];
                animal = new Cat(animalType, nameOfAnimal, weightOfAnimal, livingRegion, breed);
                animal.setFoodEaten(food.getQuantity());
            }
            animal.makeSound();
            System.out.println(animal.toString());

            input = scanner.nextLine();
        }

    }

    private static void isVegetableEater(Animal animal, String animalType, Food food) {
        if (food.getFoodType().equals("Vegetable")) {
            animal.setFoodEaten(food.getQuantity());
        } else {
            System.out.printf("%ss are not eating that type of food!%n", animalType);
        }
    }
}
