package EncapsulationExercises.PizzaCalories;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String name;
    private Dough dough;
    private List<Topping> toppingList;
    private int toppings;

    public Pizza(String name, int toppings) {
        setName(name);
        setToppings(toppings);
        this.dough = null;
        this.toppingList = new ArrayList<>();
    }

    private void setName(String name) {
        if (name.trim().isEmpty() || name.length() > 15){
            throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
        }
        this.name = name;
    }

    private void setToppings(int toppings) {
        if (toppings > 10){
            throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
        }
        this.toppings = toppings;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public String getName() {
        return name;
    }

    public int getToppings() {
        return toppings;
    }

    public void addTopping(Topping topping) {
        this.toppingList.add(topping);
    }

    public double getOverallCalories() {
        double overallCalories = 0;
        for (Topping e : toppingList) {
            double calories = e.calculateCalories();
            overallCalories += calories;
        }
        double caloriesOfDough = dough.calculateCalories();
        return (overallCalories * this.toppings) + caloriesOfDough;
    }

    @Override
    public String toString() {
        return String.format("%s - %.2f" , this.name, getOverallCalories());
    }
}
