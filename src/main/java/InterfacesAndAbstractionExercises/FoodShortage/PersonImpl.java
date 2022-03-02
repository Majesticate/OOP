package InterfacesAndAbstractionExercises.FoodShortage;

import InterfacesAndAbstractionExercises.DefineAnInterfacePerson.Person;

public class PersonImpl implements Person,Buyer {
    private String name;
    private int age;
    private int food;

    public PersonImpl(String name, int age) {
        this.name = name;
        this.age = age;
        this.food = 0;
    }

    public void setFood(int food) {
        this.food = food;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void buyFood() {

    }
    @Override
    public int getFood() {
        return food;
    }
}
