package Polymorphism.Animals;

public abstract class Animal {
    private String name;
    private String favoriteFood;

    protected Animal(String name, String favoriteFood) {
        setName(name);
        setFavoriteFood(favoriteFood);
    }

    public String explainSelf() {
        return String.format("I am %s and my favourite food is %s", getName(), getFavoriteFood());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }
}
