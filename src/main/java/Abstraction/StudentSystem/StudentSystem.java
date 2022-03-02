package Abstraction.StudentSystem;

import java.util.HashMap;
import java.util.Map;

public class StudentSystem {
    private Map<String, Student> studentMap;

    public StudentSystem() {
        this.studentMap = new HashMap<>();
    }


    public void ParseCommand(String[] inputArray) {

        switch (inputArray[0]) {
            case "Create": {
                String name = inputArray[1];
                int age = Integer.parseInt(inputArray[2]);
                double grade = Double.parseDouble(inputArray[3]);
                Student newStudent = new Student(name, age, grade);
                studentMap.putIfAbsent(name, newStudent);
                break;
            }
            case "Show": {
                String name = inputArray[1];
                if (studentMap.containsKey(name)) {
                    Student currentStudent = studentMap.get(name);
                    System.out.println(currentStudent.toString());
                }
                break;
            }
            case "Exit":
                return;
            default:
                throw new IllegalArgumentException("Invalid input");
        }
    }
}
