package EncapsulationExercises.PizzaCalories;

public enum ToppingModifiers {
    //•	Meat – 1.2;
    //•	Veggies – 0.8;
    //•	Cheese – 1.1;
    //•	Sauce – 0.9
    MEAT(1.2),
    VEGGIES(0.8),
    CHEESE(1.1),
    SAUCE(0.9);

    private double calories;

    ToppingModifiers(double calories) {
        this.calories = calories;
    }

    public double getCalories() {
        return calories;
    }

    public static ToppingModifiers getToppingModifiers(String toppingAsString) {
        switch (toppingAsString) {
            case "Meat":
                return MEAT;
            case "Veggies":
                return VEGGIES;
            case "Cheese":
                return CHEESE;
            case "Sauce":
                return SAUCE;
            default:
                throw new IllegalArgumentException("Invalid type of dough.");
        }
    }
}
