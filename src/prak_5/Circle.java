package prak_5;

public class Circle {
    protected Point center;
    int radius;

    public Circle(Point center, int radius)
    {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public int getRadius() {
        return radius;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{center = " + center +
                ", radius = " + radius +
                '}';
    }
}
