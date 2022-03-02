package InterfacesAndAbstractionExercises.FoodShortage;

public class Rebel extends PersonImpl {
    private final static int INCREASE_FOOD_WITH = 5;
    private String group;

    public Rebel(String name, int age, String group) {
        super(name, age);
        this.group = group;
    }

    @Override
    public void buyFood() {
        setFood(getFood() + INCREASE_FOOD_WITH);
    }
}
