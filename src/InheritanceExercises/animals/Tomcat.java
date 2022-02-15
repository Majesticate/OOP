package InheritanceExercises.animals;

public class Tomcat extends Cat{
    public Tomcat(String name, int age, String gender) {
        super(name, age, gender);
        setGender("Male");
    }

    @Override
    public String produceSound() {
        return "MEOW";
    }
}
