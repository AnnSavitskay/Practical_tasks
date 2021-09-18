package prak_6;

public class Main {
    public static void main(String[] args)
    {
        MovablePoint movable_left = new MovablePoint(1, 2);
        MovablePoint movable_right = new MovablePoint(3, 4);

        System.out.println(movable_left);
        System.out.println(movable_right);

        Movable_2 rectangular = new MovableRectangle(movable_left, movable_right);
        movable_left = new MovablePoint(1, 2);
        movable_right = new MovablePoint(2, 1);

        rectangular.move(movable_left, movable_right);
        System.out.println(rectangular);
        System.out.println(rectangular.speed(movable_left, movable_right));

        System.out.println(rectangular);

        movable_left = new MovablePoint(-2, 1);
        movable_right = new MovablePoint(-1, 1);

        rectangular.move(movable_left, movable_right);
        System.out.println(rectangular);
        System.out.println(rectangular.speed(movable_left, movable_right));
    }
}
