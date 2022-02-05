package Abstraction.RhombusOfStars;

public class Rhombus {
    private int n;

    public Rhombus(int n) {
        this.n = n;
    }

    public void printRhombus(){
        System.out.print(upperSide(this.n));
        System.out.println(addElements(this.n));
        System.out.print(lowerSide(this.n));
    }

    private String upperSide(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i < n; i++) {
            stringBuilder.append(addSpace(n, i));
            stringBuilder.append(addElements(i)).append(System.lineSeparator());
        }
        return stringBuilder.toString();
    }

    private String lowerSide(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = n - 1; i >= 1; i--) {
            stringBuilder.append(addSpace(n, i));
            stringBuilder.append(addElements(i)).append(System.lineSeparator());
        }
        return stringBuilder.toString();
    }

    private String addSpace(int n, int i) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int j = i; j < n; j++) {
            stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }

    private String addElements(int i) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int j = 0; j < i; j++) {
            stringBuilder.append("* ");
        }
        return stringBuilder.toString();
    }
}
