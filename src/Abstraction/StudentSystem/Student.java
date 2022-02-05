package Abstraction.StudentSystem;

public class Student {
    private String name;
    private int age;
    private double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    private String studentAssessments() {
        if (this.grade >= 5.00) {
            return "Excellent student.";
        } else if (this.grade >= 3.50) {
            return "Average student.";
        }
        return "Very nice person.";
    }

    @Override
    public String toString() {
        return String.format("%s is %d years old. %s", name, age, studentAssessments());
    }
}
