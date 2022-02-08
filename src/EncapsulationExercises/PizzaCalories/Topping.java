package EncapsulationExercises.PizzaCalories;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Topping {
    private String toppingType;
    private double weightOfTopping;

    public Topping(String toppingType, double weightOfTopping) {
        setToppingType(toppingType);
        setWeightOfTopping(weightOfTopping);
    }

    private void setToppingType(String toppingType) {
        List<String> collect = Arrays.stream(ToppingModifiers.values()).map(Enum::name).collect(Collectors.toList());
        if (collect.contains(toppingType.toUpperCase())) {
            this.toppingType = toppingType;
            return;
        }
        throw new IllegalArgumentException(String.format("Cannot place %s on top of your pizza.", toppingType));
    }

    private void setWeightOfTopping(double weightOfTopping) {
        if (weightOfTopping > 50) {
            throw new IllegalArgumentException(String.format("%s weight should be in the range [1..50].", this.toppingType));
        }
        this.weightOfTopping = weightOfTopping;
    }

    public double calculateCalories() {
        double caloriesPerGramTopping = ToppingModifiers.getToppingModifiers(toppingType).getCalories();
        return caloriesPerGramTopping * this.weightOfTopping;
    }
}
