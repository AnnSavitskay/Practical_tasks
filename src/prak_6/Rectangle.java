package prak_6;

public class Rectangle {
    MovablePoint left_point;
    MovablePoint right_point;

    public Rectangle(MovablePoint left_point, MovablePoint right_point)
    {
        this.left_point = left_point;
        this.right_point = right_point;
    }

    public Point getLeft_point() {
        return left_point;
    }

    public Point getRight_point() {
        return right_point;
    }

    public void setLeft_point(MovablePoint left_point) {
        this.left_point = left_point;
    }

    public void setRight_point(MovablePoint right_point) {
        this.right_point = right_point;
    }

    @Override
    public String toString() {
        return "Rectangle{left_point = " + left_point +
                ", right_point = " + right_point +
                '}';
    }
}
