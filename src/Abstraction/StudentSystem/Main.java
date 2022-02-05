package Abstraction.StudentSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentSystem studentSystem = new StudentSystem();

        boolean isEnd = false;

        while (!isEnd) {
            String[] input = scanner.nextLine().split(" ");
            studentSystem.ParseCommand(input);
            if (input[0].equals("Exit")) isEnd = true;
        }
    }
}
