package InterfacesAndAbstractionExercises.DefineAnInterfacePerson;

import InterfacesAndAbstractionExercises.FoodShortage.PersonImpl;
import InterfacesAndAbstractionExercises.MultipleImplementation.Birthable;
import InterfacesAndAbstractionExercises.MultipleImplementation.Identifiable;

public class Citizen extends PersonImpl implements Birthable, Identifiable {
    private final static int INCREASE_FOOD_WITH = 10;
    private String name;
    private int age;
    private String id;
    private String birthDate;
    private int food;

    public Citizen(String name, int age, String id, String birthDate) {
        super(name,age);
        this.birthDate = birthDate;
        this.id = id;
    }

    @Override
    public void buyFood() {
        setFood(getFood() + INCREASE_FOOD_WITH);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public String getBirthDate() {
        return this.birthDate;
    }

    @Override
    public String getId() {
        return this.id;
    }
}
