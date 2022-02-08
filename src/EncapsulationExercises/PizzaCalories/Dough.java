package EncapsulationExercises.PizzaCalories;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Dough {
    private String flourType;
    private String backingTechnique;
    private double weight;

    public Dough(String flourType, String backingTechnique, double weight) {
        setFlourType(flourType);
        setBackingTechnique(backingTechnique);
        setWeight(weight);
    }

    private void setFlourType(String flourType) {
        List<String> collect = Arrays.stream(DoughModifiers.values()).map(Enum::name).collect(Collectors.toList());
        if (collect.contains(flourType.toUpperCase())) {
            this.flourType = flourType;
            return;
        }
        throw new IllegalArgumentException("Invalid type of dough.");
    }

    private void setBackingTechnique(String backingTechnique) {
        List<String> collect = Arrays.stream(DoughModifiers.values()).map(Enum::name).collect(Collectors.toList());
        if (collect.contains(backingTechnique.toUpperCase())) {
            this.backingTechnique = backingTechnique;
            return;
        }
        throw new IllegalArgumentException("Invalid type of dough.");
    }

    private void setWeight(double weight) {
        if (weight > 200){
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }
        this.weight = weight;
    }

    public double calculateCalories() {
        double weightOfDough = DoughModifiers.valueOf(flourType.toUpperCase()).getWeight();
        double weightOfBackingTechnique = DoughModifiers.valueOf(backingTechnique.toUpperCase()).getWeight();

        return (2 * this.weight) * weightOfDough * weightOfBackingTechnique;
    }
}
