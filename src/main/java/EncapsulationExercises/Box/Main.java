package EncapsulationExercises.Box;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());

        try {
            Box currentBox = new Box(length, width, height);
            System.out.printf("Surface Area - %.2f\n", currentBox.calculateSurfaceArea());
            System.out.printf("Lateral Surface Area - %.2f\n", currentBox.calculateLateralSurfaceArea());
            System.out.printf("Volume - %.2f", currentBox.calculateVolume());

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
