package InheritanceExercises.restaurant;

import java.math.BigDecimal;

public class Beverages extends Product {
    private double millilitres;

    public Beverages(String name, BigDecimal price, double millilitres) {
        super(name, price);
        this.millilitres = millilitres;
    }

    public double getMillilitres() {
        return millilitres;
    }

    public void setMillilitres(double millilitres) {
        this.millilitres = millilitres;
    }
}
