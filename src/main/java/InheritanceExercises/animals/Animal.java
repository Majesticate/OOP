package InheritanceExercises.animals;

public class Animal {
    private String name;
    private int age;
    private String gender;

    public Animal(String name, int age, String gender) {
        this.name = name;
        setAge(age);
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 0){
            return;
        }
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String produceSound(){
        return "";
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(this.getClass().getSimpleName()).append(System.lineSeparator());
        builder.append(this.name).append(" ").append(this.age).append(" ").append(this.gender).append(System.lineSeparator());
        builder.append(produceSound());
        return builder.toString();
    }
}
