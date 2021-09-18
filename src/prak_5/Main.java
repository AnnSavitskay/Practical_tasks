package prak_5;

public class Main {
    public static void main(String[] args)
    {
        Point point = new Point(-1, 3);
        Movable movable = new MovablePoint(1, 2);
        System.out.println(movable);

        movable.move(2, 3);
        System.out.println(movable);

        movable = new MovableCircle(point, 2);
        System.out.println(movable);

        movable.move(3, -2);
        System.out.println(movable);
    }
}
