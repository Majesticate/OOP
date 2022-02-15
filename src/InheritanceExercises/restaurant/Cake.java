package InheritanceExercises.restaurant;

import java.math.BigDecimal;

public class Cake extends Dessert{
    public static double CAKE_GRAMS = 250;
    public static double CAKE_CALORIES = 1000;
    public static BigDecimal CAKE_PRICE = new BigDecimal(String.valueOf(5));
    public Cake(String name, BigDecimal price, double grams, double calories) {
        super(name, price, grams, calories);
        setCalories(CAKE_CALORIES);
        setGrams(CAKE_GRAMS);
        setPrice(CAKE_PRICE);
    }
}
