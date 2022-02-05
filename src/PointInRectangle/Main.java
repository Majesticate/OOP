package PointInRectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arrayInt = getPoints(scanner);

        Rectangle rectangle =
                new Rectangle(new Point(arrayInt[0], arrayInt[1]),
                new Point(arrayInt[2], arrayInt[3]));

        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {
            int[] tokens = getPoints(scanner);
            Point currentPoint = new Point(tokens[0],tokens[1]);
            String output = rectangle.isInsidePoint(currentPoint) ? "true" : "false";
            System.out.println(output);
        }
    }

    private static int[] getPoints(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    }
}
