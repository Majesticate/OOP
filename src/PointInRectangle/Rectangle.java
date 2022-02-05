package PointInRectangle;

public class Rectangle {
    private Point first;
    private Point second;

    public Rectangle(Point first, Point second) {
        this.first = first;
        this.second = second;
    }

    public boolean isInsidePoint(Point p) {
        return isInHigh(p) && isInLength(p);
    }

    private boolean isInHigh(Point p) {
        return p.getY() >= first.getY() && p.getY() <= second.getY();
    }

    private boolean isInLength(Point p) {
        return p.getX() >= first.getX() && p.getX() <= second.getX();
    }
}
