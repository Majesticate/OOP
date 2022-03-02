package InterfacesAndAbstractionExercises.BirthdayCelebration;

import InterfacesAndAbstractionExercises.MultipleImplementation.Birthable;

public class Pet implements Birthable {
    private String name;
    private String BirthDate;

    public Pet(String name, String birthDate) {
        this.name = name;
        BirthDate = birthDate;
    }

    @Override
    public String getBirthDate() {
        return this.BirthDate;
    }

    public String getName() {
        return name;
    }
}
