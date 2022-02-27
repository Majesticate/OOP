package PolymorphismExercises.WildFarm;

import java.text.DecimalFormat;

public class Cat extends Felime {
    private String breed;

    public Cat(String animalType, String animalName, Double animalWeight, String livingRegion, String breed) {
        super(animalType, animalName, animalWeight, livingRegion);
        this.breed = breed;
    }


    @Override
    public void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");
        String formatted = df.format(getAnimalWeight());
        return String.format("%s[%s, %s, %s, %s, %d]",
                getAnimalType(), getAnimalName(), this.breed, formatted, getLivingRegion(), getFoodEaten());
    }
}
