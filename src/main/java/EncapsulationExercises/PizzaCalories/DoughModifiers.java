package EncapsulationExercises.PizzaCalories;

public enum DoughModifiers {
    WHITE(1.5),
    WHOLEGRAIN(1.0),
    CRISPY(0.9),
    CHEWY(1.1),
    HOMEMADE(1.0);

    private double weight;

    DoughModifiers(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }
}
