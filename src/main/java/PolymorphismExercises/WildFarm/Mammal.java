package PolymorphismExercises.WildFarm;

import java.text.DecimalFormat;

public abstract class Mammal extends Animal {
    private String livingRegion;

    public Mammal(String animalType, String animalName, Double animalWeight, String livingRegion) {
        super(animalType, animalName, animalWeight);
        this.livingRegion = livingRegion;
    }

    public String getLivingRegion() {
        return livingRegion;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");
        String formatted = df.format(getAnimalWeight());

        return String.format("%s[%s, %s, %s, %d]",
                getAnimalType(), getAnimalName(), formatted, getLivingRegion(), getFoodEaten());
    }
}
