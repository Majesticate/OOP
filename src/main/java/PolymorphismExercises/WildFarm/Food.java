package PolymorphismExercises.WildFarm;

public class Food {
    private String foodType;
    private Integer quantity;

    public Food(String foodType, Integer quantity) {
        this.foodType = foodType;
        this.quantity = quantity;
    }

    public String getFoodType() {
        return foodType;
    }

    public Integer getQuantity() {
        return quantity;
    }
}
