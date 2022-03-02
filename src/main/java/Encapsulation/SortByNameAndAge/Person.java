package Encapsulation.SortByNameAndAge;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstName, String secondName, int age, double salary) {
        setFirstName(firstName);
        setLastName(secondName);
        setAge(age);
        setSalary(salary);
    }

    public Person(String firstName, String secondName, int age) {
        this(firstName, secondName, age, 0);
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getSecondName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return this.age;
    }

    public void setFirstName(String firstName) {
        if (firstName.length() < 3){
            throw new IllegalArgumentException("First name cannot be less than 3 symbols");
        }
        this.firstName = firstName;
    }

    public void setLastName(String secondName) {
        if (secondName.length() < 3){
            throw new IllegalArgumentException("Last name cannot be less than 3 symbols");
        }
        this.lastName = secondName;
    }

    public void setAge(int age) {
        if (age <=  0){
            throw new IllegalArgumentException("Age cannot be zero or negative integer");
        }
        this.age = age;
    }

    public void setSalary(double salary) {
        if (salary < 460){
            throw new IllegalArgumentException("Salary cannot be less than 460 leva");
        }
        this.salary = salary;
    }

    public void increaseSalary(double percentage) {
        if (this.age > 30) {
            //a=x+((y/100)*x);
            this.salary = salary + ((percentage / 100) * this.salary);
        } else {
            this.salary = salary + (((percentage / 2) / 100) * this.salary);
        }
    }

    @Override
    public String toString() {
        return String.format("%s %s is %d years old.", firstName, lastName, age);
    }
}
