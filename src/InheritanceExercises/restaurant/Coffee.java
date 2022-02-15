package InheritanceExercises.restaurant;

import java.math.BigDecimal;

public class Coffee extends HotBeverage{
    static final double COFFEE_MILLILITERS = 50;
    static final BigDecimal COFFEE_PRICE = BigDecimal.valueOf(3.50);
    //•	caffeine – double
    //•	Getter for caffeine

    private double caffeine;

    public Coffee(String name, BigDecimal price, double millilitres, double caffeine) {
        super(name, price, millilitres);
        setMillilitres(COFFEE_MILLILITERS);
        setPrice(COFFEE_PRICE);
        this.caffeine = caffeine;
    }

    public double getCaffeine() {
        return caffeine;
    }

    public void setCaffeine(double caffeine) {
        this.caffeine = caffeine;
    }
}
