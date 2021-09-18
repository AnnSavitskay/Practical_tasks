package prak_6;

public class MovableRectangle extends Rectangle implements Movable_2{
    public MovableRectangle(MovablePoint left_point, MovablePoint right_point)
    {
        super(left_point, right_point);
    }

    @Override
    public String speed(MovablePoint left_point, MovablePoint right_point)
    {
        if(left_point.getX()*left_point.getX() + left_point.getY()*left_point.getY() == right_point.getX()*right_point.getX() + right_point.getY()*right_point.getY())
            return "speed is equal";
        else return "different speed";
    }

    @Override
    public void move(MovablePoint left_point, MovablePoint right_point) {
        this.left_point.move(left_point.getX(), left_point.getY());
        this.right_point.move(right_point.getX(), right_point.getY());
    }
}
