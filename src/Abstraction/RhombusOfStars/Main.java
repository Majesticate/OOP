package Abstraction.RhombusOfStars;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Rhombus rhombus = new Rhombus(n);
        rhombus.printRhombus();


    }

    /*
    public static void printRhombus(int n) {
        System.out.print(upperSide(n));
        System.out.println(addElements(n));
        System.out.print(lowerSide(n));
    }

    private static String upperSide(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i < n; i++) {
            stringBuilder.append(addSpace(n, i));
            stringBuilder.append(addElements(i)).append(System.lineSeparator());
        }
        return stringBuilder.toString();
    }

    private static String lowerSide(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = n - 1; i >= 1; i--) {
            stringBuilder.append(addSpace(n, i));
            stringBuilder.append(addElements(i)).append(System.lineSeparator());
        }
        return stringBuilder.toString();
    }

    private static String addSpace(int n, int i) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int j = i; j < n; j++) {
            stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }

    private static String addElements(int i) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int j = 0; j < i; j++) {
            stringBuilder.append("* ");
        }
        return stringBuilder.toString();
    }

     */
}
