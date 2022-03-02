package InheritanceExercises.animals;

public class Kitten extends Cat {
    public Kitten(String name, int age, String gender) {
        super(name, age, gender);
        setGender("Female");
    }

    @Override
    public String produceSound() {
        return "Meow";

    }
}
