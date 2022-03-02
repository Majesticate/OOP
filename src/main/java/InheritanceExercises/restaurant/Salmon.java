package InheritanceExercises.restaurant;

import java.math.BigDecimal;

public class Salmon extends Food{
    public static double SALMON_GRAMS = 22;
    public Salmon(String name, BigDecimal price, double grams) {
        super(name, price, grams);
        setGrams(SALMON_GRAMS);
    }
}
