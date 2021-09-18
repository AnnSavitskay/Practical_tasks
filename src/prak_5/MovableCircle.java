package prak_5;

public class MovableCircle extends Circle implements Movable{
    public MovableCircle(Point center, int radius)
    {
        super(center, radius);
    }

    @Override
    public void move(int x, int y)
    {
        this.center.setX(this.center.getX() + x);
        this.center.setY(this.center.getY() + y);
    }
}
